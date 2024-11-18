public class LibraryConfigManager {
    private static volatile LibraryConfigManager instance;
    private double lateFee = 1.5;
    private int borrowingLimit = 2;
    private String openingHours = "9 AM - 5 PM";

    private LibraryConfigManager() {}

    public static LibraryConfigManager getInstance() {
        if (instance == null) {
            synchronized (LibraryConfigManager.class) {
                if (instance == null) {
                    instance = new LibraryConfigManager();
                }
            }
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
