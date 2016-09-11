package com.sergtm.application.subsetOfASet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 11.09.2016.
 */
public class SubsetOfASet {
    public int subsetOfASet(int lastNumber){
        boolean stat = false;
        List<Integer> resultList = new ArrayList<>();
        List<Integer> invalidNumbers = new ArrayList<>();
        for(int i = 1; i <= lastNumber; i++){
            for (int x = 0; x < invalidNumbers.size(); x++){
                if(i == invalidNumbers.get(x)){
                    stat = true;
                }

            }
            if(!stat){
                invalidNumbers.add(i * 2);
                resultList.add(i);
            }
            stat = false;
        }
        int result = resultList.size();
        return result;
    }
}
