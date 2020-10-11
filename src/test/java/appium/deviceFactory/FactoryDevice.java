package appium.deviceFactory;

public class FactoryDevice {

    public static IDevice make(String type) {
        IDevice device;
        device = new Android();
        return device;
    }
}
