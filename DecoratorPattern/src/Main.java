public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " -> $" + basicCoffee.getCost());

        // Adding milk
        Coffee coffeeWithMilk = new MilkDecorator(basicCoffee);
        System.out.println(coffeeWithMilk.getDescription() + " -> $" + coffeeWithMilk.getCost());

        // Adding sugar
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " -> $" + coffeeWithMilkAndSugar.getCost());

        // Adding whipped cream
        Coffee coffeeWithWhippedCream = new WhippedCreamDecorator(coffeeWithMilkAndSugar);
        System.out.println(coffeeWithWhippedCream.getDescription() + " -> $" + coffeeWithWhippedCream.getCost());
    }
}
