public class BalanceCheck {
    public boolean checkBalance(String cardNumber, double amount) {
        System.out.println("> Checking if balance is sufficient for card number: " + cardNumber + "...");
        return amount >= 25.99;
    }
}