public class Department {
    private final String name;
    private volatile Printer printer;

    public Department(String name) {
        this.name = name;
    }

    public Printer getPrinter(PrinterFactory factory) {
        if (printer == null) {
            synchronized (Printer.class) {
                if(printer == null) {
                    printer = factory.createPrinter(name);
                }
            }
        }
        return printer;
    }

}