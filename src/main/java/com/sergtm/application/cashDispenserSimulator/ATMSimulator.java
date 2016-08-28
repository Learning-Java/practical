package com.sergtm.application.cashDispenserSimulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 01.08.2016.
 */
public class ATMSimulator {

    public List<Integer> cashCounter(int amountParam, List<Integer> nominals) throws GoToOtherATMException {
        List<Integer> result = new ArrayList<>();
        int nominalSize = nominals.size();
        int amount = amountParam;

        int index = 0;
        do{
            Integer nominal = nominals.get(index);
            if(amount >= nominal) {
                amount = amount - nominal;
                result.add(nominal);
                index = 0;
                continue;
            }
            index++;

        }while (index != nominalSize);

        if(amount != 0){
            throw new GoToOtherATMException("Go to other ATM");
        }

        return result;

    }
}
