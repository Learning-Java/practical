package com.sergtm.application.whoIsBetter;

/**
 * Created by admin on 11.08.2016.
 */
public class WhoIsBetter {
    private int getSumOfNumber(int number){
        int lastNumber = number;
        int res = number%10;

        while(lastNumber>0){
            lastNumber = lastNumber / 10;
            res = res + lastNumber%10;
        }
        return res;
    }
    public int compare(int firstNumber, int secondNumber){

        int firstNumberResult = getSumOfNumber(firstNumber);
        int secondNumberResult = getSumOfNumber(secondNumber);

        if (firstNumberResult > secondNumberResult){
            return firstNumberResult;
        }else if(secondNumberResult > firstNumberResult){
            return secondNumberResult;
        }
        else {
            return secondNumberResult;
        }
    }
}
