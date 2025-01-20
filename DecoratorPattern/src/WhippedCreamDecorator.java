public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getCoffee().getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return super.getCoffee().getCost() + 0.75;
    }
}
