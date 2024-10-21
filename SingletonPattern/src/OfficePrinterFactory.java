public class OfficePrinterFactory extends PrinterFactory {
    @Override
    public Printer createPrinter(String departmentName) {
        return Printer.createPrinter(departmentName);
    }
}