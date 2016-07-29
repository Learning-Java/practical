package com.sergtm.application.copyAndPaste;

public class RegularBankAccount {

    private String number;
    private double balance;
    private Integer amountOfCostlyOperations;



    public Integer getAmountOfCostlyOperations() {
        return amountOfCostlyOperations;
    }

    public void setAmountOfCostlyOperations(Integer amountOfCostlyOperations) {
        this.amountOfCostlyOperations = amountOfCostlyOperations;
    }

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
}
