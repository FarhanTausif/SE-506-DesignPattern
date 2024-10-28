public class Ledger {
    public void makeEntry(String cardNumber, double amount, String operationType) {
        System.out.println("> Making ledger entry for " + operationType + " of $" + amount + " for card number: " + cardNumber + "...");
    }
}