package com.sergtm.application.copyAndPaste;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by admin on 29.07.2016.
 */
public class Main {
    public static void main(String[] args){

        Main main = new Main();

        ArrayList<RegularBankAccount> regularBankAccountList = new ArrayList();
        ArrayList<SavingsBankAccount> savingsBankAccountList = new ArrayList();

        SavingsBankAccount savingsBankAccount = new SavingsBankAccount();
        SavingsBankAccount savingsBankAccount1 =new SavingsBankAccount();
        RegularBankAccount regularBankAccount = new RegularBankAccount();
        RegularBankAccount regularBankAccount1 = new RegularBankAccount();

            regularBankAccount1.setBalance(125);
            regularBankAccount1.setNumber("1223");

            regularBankAccount.setNumber("123");
            regularBankAccount.setBalance(100);
            regularBankAccount.setAmountOfCostlyOperations(7);

            savingsBankAccount1.setBalance(255);
            savingsBankAccount1.setNumber("12232231");

            savingsBankAccount.setNumber("888");
            savingsBankAccount.setBalance(800);
            savingsBankAccount.setInterestRate(0.03);

        regularBankAccount.displayRegularBA(regularBankAccount);
        savingsBankAccount.displaySavingsBA(savingsBankAccount);

        savingsBankAccountList.add(savingsBankAccount);
        savingsBankAccountList.add(savingsBankAccount1);
        main.displaySavingBAList(savingsBankAccountList);

        regularBankAccountList.add(regularBankAccount);
        regularBankAccountList.add(regularBankAccount1);
        main.displayRegularBAList(regularBankAccountList);
    }

    public void displayRegularBAList( ArrayList<RegularBankAccount> listOfBankAccounts){

        for (RegularBankAccount s : listOfBankAccounts) {
            System.out.println(s);
        }
    }
    public void displaySavingBAList( ArrayList<SavingsBankAccount> listOfSavingBankAccounts) {

        for (SavingsBankAccount s : listOfSavingBankAccounts) {
            System.out.println(s);
        }
    }
}



