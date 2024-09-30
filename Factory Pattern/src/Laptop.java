public class Laptop extends Device{
    private String model;
    private String displaySize;
    private String RAM;

    public Laptop(Object... attributes){
        this.model = (String) attributes[0];
        this.displaySize = (String) attributes[1];
        this.RAM = (String) attributes[2];
    }

    @Override
    public void powerOn() {
        System.out.println(this.model + " Laptop is turning on... ...!");
    }

    @Override
    public void powerOff() {
        System.out.println(this.model + " Laptop is turning off... ...!");
    }

    @Override
    public void displayDevice() {
        System.out.println("This " + this.model + " Laptop has a " + this.displaySize + " display and this has a RAM of: " + this.RAM);
    }
}
