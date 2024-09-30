public class Tablet extends Device{
    private String model;
    private String cameraQuality;

    public Tablet(Object... attributes){
        this.model = (String) attributes[0];
        this.cameraQuality = (String) attributes[1];
    }
    @Override
    public void powerOn() {
        System.out.println( this.model + " tablet is turning on... ...!");
    }

    @Override
    public void powerOff() {
        System.out.println(this.model + "Tablet is turning off... ...!");
    }

    @Override
    public void displayDevice() {
        System.out.println("This " + this.model + " tablet has a " + this.cameraQuality + " camera quality");
    }
}
