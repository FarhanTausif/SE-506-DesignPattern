import java.util.ArrayList;
import java.util.List;

public class ImageViewer {
    private List<Image> images = new ArrayList<>();

    public void addImage(String filename) {
        images.add(new ImageProxy(filename));
    }

    public void showImageList() {
        System.out.println("Image List:");
        for (Image image : images) {
            System.out.println(image.getFilename());
        }
    }

    public void displayImage(String filename) {
        for (Image image : images) {
            if (image.getFilename().equals(filename)) {
                image.display();
                return;
            }
        }
        System.out.println("Image not found: " + filename);
    }
}
