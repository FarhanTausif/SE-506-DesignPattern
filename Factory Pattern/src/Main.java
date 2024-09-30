public class Main {
    public static void main(String[] args) {
        DeviceFactory smartPhoneFactory = new SmartPhoneFactory();
        Device device = smartPhoneFactory.createDevice("Samsung Galaxy A30","Good", "Large");
        device.powerOn();
        device.displayDevice();
        device.powerOff();

        TabletFactory tabletFactory = new TabletFactory();
        device = tabletFactory.createDevice("Xioami-Note24", "Good");
        device.powerOn();
        device.displayDevice();
        device.powerOff();

        LaptopFactory laptopFactory = new LaptopFactory();
        device = laptopFactory.createDevice("Lenovo IdeaPad A15", "15 inch" , "16 GB");
        device.powerOn();
        device.displayDevice();
        device.powerOff();
    }
}