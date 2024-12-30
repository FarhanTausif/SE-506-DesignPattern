import java.util.ArrayList;
import java.util.List;

public class File implements FileSystemComponent {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();
        System.out.println("Searching in file: " + name);
        if (content.contains(keyword)) {
            results.add(name);
        }
        return results;
    }
}
