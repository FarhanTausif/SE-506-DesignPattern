public class LibraryAccessProxy implements LibraryAccess {
    private final RealLibraryAccess realAccess;
    private final int borrowingLimit;

    public LibraryAccessProxy(RealLibraryAccess realAccess, int borrowingLimit) {
        this.realAccess = realAccess;
        this.borrowingLimit =  borrowingLimit;
    }

    @Override
    public LibraryItem accessItem(String itemID, User user) {
        if (user.hasPermission(itemID) && user.getNumberOfBorrowedItems() <= borrowingLimit) {
            user.setNumberOfBorrowedItems(user.getNumberOfBorrowedItems()+1);
            return realAccess.accessItem(itemID, user);
        } else {
            throw new SecurityException("Access Denied: Restricted Item-" + itemID + " Or, your borrowing limit is exceeded!");
        }
    }
}
