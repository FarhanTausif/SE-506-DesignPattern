import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final Set<String> accessibleItems = new HashSet<>();
    private int numberOfBorrowedItems;

    public User(String name) {
        this.name = name;
        this.numberOfBorrowedItems=0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBorrowedItems() {
        return numberOfBorrowedItems;
    }

    public void setNumberOfBorrowedItems(int numberOfBorrowedItems) {
        this.numberOfBorrowedItems = numberOfBorrowedItems;
    }

    public void grantAccess(String itemID) {
        accessibleItems.add(itemID);
    }

    public boolean hasPermission(String itemID) {
        return accessibleItems.contains(itemID);
    }

    public String getUserDetails() {
        return "User{" +
                "name='" + name + '\'' +
                ", accessibleItems=" + accessibleItems +
                ", numberOfBorrowedItems=" + numberOfBorrowedItems +
                '}';
    }
}
