package org.example;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected org.example.PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0)
            return;
        else {
            System.out.println("Added balance: " + balance);
            this.balance = balance;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 16){
            return;
        }
        this.cardNumber = cardNumber;
    }

    public void setPaymentSystem(org.example.PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(org.example.PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public org.example.PaymentSystem getPaymentSystem(){
        return paymentSystem;
    }

    protected boolean isBalanceGreaterOrEqualThan(int amount){
        return  balance >= amount;
    }

    public void payInCountry(Country country, int amount){
        if (isCountryValidForThisCard(country) && isBalanceGreaterOrEqualThan(amount)){
            balance = balance - amount;
            System.out.println("Accepted");
        }
    }
    protected abstract boolean isCountryValidForThisCard(Country country);

}
