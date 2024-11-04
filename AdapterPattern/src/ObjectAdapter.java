public class ObjectAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    public ObjectAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String document) {
        legacyPrinter.oldPrintMethod(document);
    }
}

