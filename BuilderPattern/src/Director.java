public class Director {
    public void constructEggSandwich(Builder builder){
        builder.setBread("Toasted");
        builder.setFilling("Fried Egg");
        builder.setSpread("Sauce");
        builder.setSandwichType(SandwichType.EGG_SANDWICH);
    }

    public void constructChickenSandwich(Builder builder){
        builder.setBread("Regular");
        builder.setFilling("Grilled Chicken");
        builder.setSpread("Cheese");
        builder.setSandwichType(SandwichType.CHICKEN_SANDWICH);
    }

}
