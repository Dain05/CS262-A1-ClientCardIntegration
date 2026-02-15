public class Card {

    private String cardNumber;
    private double balance;
    private int pin;
    private boolean isActive;

    public Card(String cardNumber, double balance, int pin, boolean isActive) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.isActive = isActive;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean updatePin(int oldPin, int newPin) {
        if (oldPin == this.pin) {
            this.pin = newPin;
            System.out.println("PIN updated successfully.");
            return true;
        }
        System.out.println("PIN update failed. Old PIN does not match.");
        return false;
    }

    public void activateCard() {
        this.isActive = true;
        System.out.println("Card activated successfully.");
    }

    private String getMaskedCardNumber() {

        if (cardNumber == null || cardNumber.length() < 4) {
            return "XXXX-XXXX-XXXX-XXXX";
        }

        String last4 = cardNumber.substring(cardNumber.length() - 4);
        return "XXXX-XXXX-XXXX-" + last4;
    }

    @Override
    public String toString() {
        return "Card Number: " + getMaskedCardNumber() +
                "\nBalance: $" + String.format("%.2f", balance) +
                "\nPIN: ****" +
                "\nActive: " + isActive;
    }
}

