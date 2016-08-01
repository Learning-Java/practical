package com.sergtm.application.cashDispenserSimulator;

/**
 * Created by admin on 01.08.2016.
 */
public class Cash {
    private final int nominal;
    private final int amount;

    public Cash(int nominal, int amount){
        this.amount = amount;
        this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }

    public int getAmount() {
        return amount;
    }
}
