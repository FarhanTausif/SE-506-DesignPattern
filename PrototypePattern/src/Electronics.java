import java.util.Objects;

public class Electronics extends Product {

    private String storageOption;   // Single storage option as a string
    private String batteryLife;

    public Electronics() {

    }

    public Electronics(String name, String category, double price, String storageOption, String batteryLife) {
        super(name, category, price);
        this.storageOption = storageOption;
        this.batteryLife = batteryLife;
    }


    public Electronics (Electronics target) {
        super(target);
        if(target != null) {
            this.storageOption = target.storageOption;
            this.batteryLife = target.batteryLife;
        }
    }

    @Override
    public Electronics clone() {
        return new Electronics(this);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "storageOption='" + storageOption + '\'' +
                ", batteryLife='" + batteryLife + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}' + " created!";
    }

    public String getStorageOption() {
        return storageOption;
    }

    public void setStorageOption(String storageOption) {
        this.storageOption = storageOption;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronics that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(storageOption, that.storageOption) && Objects.equals(batteryLife, that.batteryLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), storageOption, batteryLife);
    }
}