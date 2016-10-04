package com.sergtm.application.allVariantsOfNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 21.09.2016.
 */
public class AllVariantsOfNumberTask {
    public List<String> allVariantsOfNumber(int[] array, int resultNumber){
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= array.length; i++){
            for(int x = 0; x <= array.length; x++){
                if (i + x == resultNumber){
                    String res = i + " + " + x + " = "+ resultNumber ;
                    list.add(res);
                }
            }
        }
        return list;
    }
}
