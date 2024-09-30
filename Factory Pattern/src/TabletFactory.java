public class TabletFactory implements DeviceFactory{

    @Override
    public Device createDevice(Object... attributes) {
        return new Tablet(attributes);
    }
}
