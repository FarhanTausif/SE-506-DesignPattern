import java.util.Objects;

public class Clothing extends Product {

    private String color;
    private String size;

    public Clothing(String name, String category, double price, String color, String size ) {
        super(name, category, price);
        this.color = color;
        this.size = size;
    }

    public Clothing(Clothing target) {
        super(target);
        if(target != null) {
            this.color = target.color;
            this.size = target.size;
        }
    }

    @Override
    public Clothing clone() {
        return new Clothing(this);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}' + " created!";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothing clothing)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(color, clothing.color) && Objects.equals(size, clothing.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, size);
    }
}