public class Printer {
    private final String departmentName;

    private Printer(String departmentName) {
        this.departmentName = departmentName;
    }

    public void print(String document) {
        System.out.println("Printing document: " + document + " on " + this.departmentName + " department's printer.");
    }

    public static Printer createPrinter(String departmentName) {
        return new Printer(departmentName);
    }
}
