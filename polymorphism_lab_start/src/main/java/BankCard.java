public abstract class BankCard {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }
}
