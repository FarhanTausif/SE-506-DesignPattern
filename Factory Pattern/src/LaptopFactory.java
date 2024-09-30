public class LaptopFactory implements DeviceFactory{

    @Override
    public Device createDevice(Object... attributes) {
        return new Laptop(attributes);
    }
}
