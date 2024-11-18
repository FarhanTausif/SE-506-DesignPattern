import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess {
    private final Map<String, LibraryItem> libraryItems = new HashMap<>();

    public RealLibraryAccess() {
        libraryItems.put("B001", new Book("1984", "George Orwell"));
        libraryItems.put("B002", new Book("To Kill a Mockingbird", "Harper Lee"));
        libraryItems.put("B003", new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.put("B004", new Book("Pride and Prejudice", "Jane Austen"));
        libraryItems.put("B005", new Book("The Catcher in the Rye", "J.D. Salinger"));

        libraryItems.put("M001", new Magazine("Science Today", 1));
        libraryItems.put("M002", new Magazine("National Geographic", 2));
        libraryItems.put("M003", new Magazine("Time", 3));
        libraryItems.put("M004", new Magazine("The Economist", 4));
        libraryItems.put("M005", new Magazine("Popular Science", 5));
    }

    @Override
    public LibraryItem accessItem(String itemID, User user) {
        return libraryItems.get(itemID);
    }
}
