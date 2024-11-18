public class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book: " + title + " by " + author;
    }

    @Override
    public boolean borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }
}

