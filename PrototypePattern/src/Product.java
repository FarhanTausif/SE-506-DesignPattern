import java.util.Objects;

public abstract class Product {
    public String name;
    public String category;
    public double price;

    public Product(){

    }

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product(Product target) {
        if(target != null) {
            this.name = target.name;
            this.category = target.category;
            this.price = target.price;
        }
    }

    public abstract Product clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return product.price == price && Objects.equals(product.name, name) && Objects.equals(product.category, category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price);
    }

}
