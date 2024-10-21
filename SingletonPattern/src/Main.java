public class Main {
    public static void main(String[] args) {
        PrinterFactory factory = new OfficePrinterFactory();

        Department hrDepartment = new Department("HR");

        Printer hrPrinter = hrDepartment.getPrinter(factory);
        hrPrinter.print("HR Document 1");
        Printer hrPrinter2 = hrDepartment.getPrinter(factory);
        hrPrinter2.print("HR Document 2");

        //validating whether the same hrPrinter is used the second time of asking
        if (hrPrinter.hashCode() == hrPrinter2.hashCode()) {
            System.out.println("Using the same hrPrinter");
        }
        else {
            System.out.println("Different printers are used!");
        }


        Department itDepartment = new Department("IT");
        Printer itPrinter = itDepartment.getPrinter(factory);
        itPrinter.print("IT Document 1");


        Department financeDepartment = new Department("Finance");
        Printer financePrinter = financeDepartment.getPrinter(factory);
        financePrinter.print("Finance Document 1");

        Department marketingDepartment = new Department("Marketing");
        Printer marketingPrinter = marketingDepartment.getPrinter(factory);
        marketingPrinter.print("Marketing Document 1");
    }
}