package com.sergtm.application.copyAndPaste;

public class SavingsBankAccount {
    private String number;
    private double interestRate;
    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Number: ").append(number).append(", Balance: ").append(balance);
        return builder.toString();
    }

}
