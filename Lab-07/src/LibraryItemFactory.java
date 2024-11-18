public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String title, String authorOrIssue) {
        if (type.equalsIgnoreCase("Book")) {
            return new Book(title, authorOrIssue);
        } else if (type.equalsIgnoreCase("Magazine")) {
            return new Magazine(title, Integer.parseInt(authorOrIssue));
        }
        throw new IllegalArgumentException("Invalid item type");
    }
}
