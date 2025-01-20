public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getCoffee().getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCoffee().getCost() + 0.25;
    }
}
