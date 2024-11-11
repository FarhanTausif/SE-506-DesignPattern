public class Main {
    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer();


        viewer.addImage("photo1.jpg");
        viewer.addImage("photo2.jpg");
        viewer.addImage("photo3.jpg");


        viewer.showImageList();


        System.out.println("\nUser selects 'photo1.jpg' to view:");
        viewer.displayImage("photo1.jpg");

        System.out.println("\nUser selects 'photo2.jpg' to view:");
        viewer.displayImage("photo2.jpg");

        viewer.displayImage("photo1.jpg");
    }
}
