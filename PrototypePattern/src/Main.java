public class Main {
    public static void main(String[] args) {
        Clothing blackTShirt = new Clothing("T-shirt", "clothing", 500.00, "Black", "XL");
        Electronics smartphone = new Electronics("Samsung", "Smartphone", 50000.00, "16GB", "35hrs");
        System.out.println(blackTShirt);
        System.out.println(smartphone);
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();

        prototypeRegistry.addPrototype("Black T-shirt", blackTShirt);
        prototypeRegistry.addPrototype("16 GB smartphone", smartphone);

        Product clonedTShirt = prototypeRegistry.getPrototype("Black T-shirt");
        Product clonedSmartphone = prototypeRegistry.getPrototype("16 GB smartphone");
        System.out.println(clonedTShirt);
        System.out.println(clonedSmartphone);

        if(blackTShirt != clonedTShirt ) {
            if(blackTShirt.equals(clonedTShirt)) System.out.println("Identical T-shirt!");
            else System.out.println("Not identical T-shirt!");
        }

        if(blackTShirt != clonedSmartphone) {
            if(blackTShirt.equals(clonedSmartphone)) System.out.println("Identical objects");
            else System.out.println("Not identical objects!");
        }
        
        Clothing yellowTShirt = (Clothing) prototypeRegistry.getPrototype("Black T-shirt");
        yellowTShirt.setColor("Yellow");
        System.out.println(yellowTShirt);
        if(blackTShirt != yellowTShirt ) {
            if(blackTShirt.equals(yellowTShirt)) System.out.println("Identical T-shirt!");
            else System.out.println("Not identical T-shirt!");
        }

    }
}
