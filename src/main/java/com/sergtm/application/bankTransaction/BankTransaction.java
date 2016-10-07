package com.sergtm.application.bankTransaction;

import java.util.Scanner;

/**
 * Created by admin on 04.10.2016.
 */
public class BankTransaction {
    public static void main(String[] args) throws WrongTransactionException {
        int sum = 0;
        int pay = 0;
        int thd = 0;
        int less = 0;

        System.out.println("Enter your sum");
        Scanner in = new Scanner(System.in);
        sum = in.nextInt();

        if(sum > 7){
            thd = sum/100;
            pay+=thd*7;
            less= sum%100;
        }
        if(less < 100 && less >= 1){
            pay+=7;
        }
        if(sum < 7){
            throw new WrongTransactionException("This transaction can't be finished.");
        }
        int resultSum = sum-pay;
        System.out.println("Your sum: " + resultSum);
        System.out.println("Commission: " + pay);
    }
}
