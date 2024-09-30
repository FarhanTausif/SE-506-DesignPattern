public class SmartPhoneFactory implements DeviceFactory{
    @Override
    public Device createDevice(Object... attributes) {
        return new SmartPhone(attributes);
    }
}
