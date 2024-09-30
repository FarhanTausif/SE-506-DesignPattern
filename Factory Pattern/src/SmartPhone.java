public class SmartPhone extends Device{
    private String model;
    private String displaySize;
    private String cameraQuality;

    public SmartPhone(Object... attributes){
        this.model = (String) attributes[0];
        this.cameraQuality = (String) attributes[1];
        this.displaySize = (String) attributes[2];
    }

    @Override
    public void powerOn() {
        System.out.println(this.model + " Smartphone is turning on... ...!");
    }

    @Override
    public void powerOff() {
        System.out.println(this.model + " Smartphone is turning off... ...!");
    }

    @Override
    public void displayDevice() {
        System.out.println("The " + this.model + " smartphone has a " + this.displaySize + " and the camera quality is: " + this.cameraQuality);
    }

}
