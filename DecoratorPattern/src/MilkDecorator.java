public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getCoffee().getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCoffee().getCost() + 0.50;
    }
}
