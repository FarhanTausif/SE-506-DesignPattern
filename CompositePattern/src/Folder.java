// Composite class representing a Folder
import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> folderChildComponents = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent fileSystemComponent) {
        folderChildComponents.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent) {
        folderChildComponents.remove(fileSystemComponent);
    }

    @Override
    public List<String> search(String keyword) {
        List<String> results = new ArrayList<>();
        System.out.println("Searching in folder: " + name);
        for (FileSystemComponent child : folderChildComponents) {
            List<String> childResults = child.search(keyword);
            for (String childResult : childResults) {
                results.add(name + "/" + childResult);
            }
        }
        return results;
    }
}