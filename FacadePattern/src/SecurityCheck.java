public class SecurityCheck {
    public boolean checkPIN(String cardNumber, String pin) {
        System.out.println("> Checking security PIN for card number: " + cardNumber + "...") ;
        return "1234".equals(pin);
    }
}