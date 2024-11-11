import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich sandwich;
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("===\t\t\t SUBWAY SANDWICH \t\t\t===");
        while(running){
            System.out.println("Enter your sandwich type:");
            System.out.println("1. Egg Sandwich\n2. Chicken Sandwich\n3.Exit\n");
            int sandwichType = scanner.nextInt();

            switch (sandwichType){
                case 1:
                    director.constructEggSandwich(builder);
                    sandwich = builder.getResult();
                    System.out.println(sandwich + " " + "built");
                    break;

                case 2:
                    director.constructChickenSandwich(builder);
                    sandwich = builder.getResult();
                    System.out.println(sandwich + " " + "built");
                    break;

                default:
                    running = false;
                    break;
            }

        }

    }

}