import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("Document1.txt", "This is a test document.");
        File file2 = new File("Document2.txt", "This document contains important information.");
        File file3 = new File("Notes.txt", "Some notes about the project.");

        Folder folder1 = new Folder("ProjectFolder");
        Folder folder2 = new Folder("SubFolder");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        folder1.add(folder2);

        System.out.println("Starting search for keyword \"important\":");
        List<String> results1 = folder1.search("important");
        if(!results1.isEmpty()) {
            System.out.println("Search Results: " + results1);
        }else {
            System.out.println("Search Results: Not Found!" );
        }

        System.out.println("\nStarting search for keyword \"notes\":");
        List<String> results2 = folder1.search("notes");
        if(!results2.isEmpty()) {
            System.out.println("Search Results: " + results2);
        }else {
            System.out.println("Search Results: Not Found!" );
        }

        System.out.println("\nStarting search for keyword \"asad\":");
        List<String> results3 = folder1.search("asad");
        if(!results3.isEmpty()) {
            System.out.println("Search Results: " + results3);
        }else {
            System.out.println("Search Results: Not Found!" );
        }
    }
}
