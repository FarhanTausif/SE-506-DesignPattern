public class ClassAdapter extends LegacyPrinter implements Printer {
    @Override
    public void print(String document) {
        oldPrintMethod(document);
    }
}
