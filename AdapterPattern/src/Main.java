public class Main {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        modernPrinter.print("Document for Modern Printer");

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer objectAdapter = new ObjectAdapter(legacyPrinter);
        objectAdapter.print("Document for Legacy Printer using Object Adapter");

        Printer classAdapter = new ClassAdapter();
        classAdapter.print("Document for Legacy Printer using Class Adapter");
    }
}