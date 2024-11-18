public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryConfigManager configManager = LibraryConfigManager.getInstance();
        System.out.println("Library opens at: " + configManager.getOpeningHours());
        configManager.setLateFee(.5);
        System.out.println("New Late fee is set to: " + configManager.getLateFee());
        System.out.println("Borrowing Limit is: " + configManager.getBorrowingLimit());

        User user = new User("Tausif");
        user.grantAccess("B001");
        user.grantAccess("M005");

        RealLibraryAccess realAccess = new RealLibraryAccess();
        LibraryAccess proxyAccess = new LibraryAccessProxy(realAccess, configManager.getBorrowingLimit());

        try {
            LibraryItem item = proxyAccess.accessItem("B001", user);
            System.out.println("Accessed: " + item.getDetails());
            if (item.borrowItem()) {
                System.out.println(user.getName() + " Borrowed " + item.getDetails() + " successfully!");
            } else {
                System.out.println("Already borrowed.");
            }

            item = proxyAccess.accessItem("M005", user);
            if (item.borrowItem()) {
                System.out.println(user.getName() + " Borrowed " + item.getDetails() + " successfully!");
            } else {
                System.out.println("Already borrowed.");
            }
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        try{
            LibraryItem item = proxyAccess.accessItem("B002", user);
            if (item.borrowItem()) {
                System.out.println(user.getName() + " Borrowed " + item.getDetails() + " successfully!");
            } else {
                System.out.println("Already borrowed.");
            }
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(user.getUserDetails());
    }
}
