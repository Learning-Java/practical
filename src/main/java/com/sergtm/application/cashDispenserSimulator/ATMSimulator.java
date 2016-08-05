package com.sergtm.application.cashDispenserSimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 01.08.2016.
 */
public class ATMSimulator {

    public List<Integer> cashCounter(int amount, List<Integer> nominal) throws GoToOtherATMException {
        List<Integer> result = new ArrayList<Integer>();
        int index = 0;
        do{
            Integer cash = nominal.get(index);
            if(amount >= cash) {
                amount = amount - cash;
                result.add(cash);
                index = 0;
                continue;
            }
            index++;

        }while (index != nominal.size());

        if(amount != 0){
            throw new GoToOtherATMException("Go to other ATM");
        }

        return result;

    }
}
