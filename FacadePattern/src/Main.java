public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        String cardNumber = "1234-5678-9876-5432";
        String pin = "1234";
        double amount = 25.99;
        String operationType = "Debit";

        orderFacade.placeOrder(cardNumber, pin, amount, operationType);
    }
}
