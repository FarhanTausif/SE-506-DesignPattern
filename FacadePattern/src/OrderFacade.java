// OrderFacade.java
public class OrderFacade {
    private AccountVerification accountVerification;
    private SecurityCheck securityCheck;
    private BalanceCheck balanceCheck;
    private Ledger ledger;
    private NotificationService notificationService;

    public OrderFacade() {
        accountVerification = new AccountVerification();
        securityCheck = new SecurityCheck();
        balanceCheck = new BalanceCheck();
        ledger = new Ledger();
        notificationService = new NotificationService();
    }

    public void placeOrder(String cardNumber, String pin, double amount, String operationType) {
        System.out.println("Processing pizza order...");

        if (!accountVerification.verifyAccount(cardNumber)) {
            System.out.println("Account verification failed.");
            return;
        }

        if (!securityCheck.checkPIN(cardNumber, pin)) {
            System.out.println("Security PIN check failed.");
            return;
        }

        if (!balanceCheck.checkBalance(cardNumber, amount)) {
            System.out.println("Insufficient balance.");
            return;
        }

        ledger.makeEntry(cardNumber, amount, operationType);
        notificationService.sendNotification("Your pizza order has been successfully placed!");

        System.out.println("Pizza order completed successfully.");
    }
}
