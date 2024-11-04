public class ModernPrinter implements Printer{
    @Override
    public void print(String document) {
        System.out.println("Modern printer is printing - " + document);
    }
}