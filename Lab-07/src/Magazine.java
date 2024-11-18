public class Magazine implements LibraryItem {
    private final String title;
    private final int issue;
    private boolean isBorrowed = false;

    public Magazine(String title, int issue) {
        this.title = title;
        this.issue = issue;
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title + ", Issue: " + issue;
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
