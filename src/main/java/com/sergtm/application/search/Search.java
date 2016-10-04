package com.sergtm.application.search;

/**
 * Created by admin on 03.09.2016.
 */
public class Search {
    public int search(int[] array, int searchObjective) throws NoSuchNumberInArrayException {
        int result = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == searchObjective){
                result = array[i];
            }
        }
        if(result == 0){
            throw new NoSuchNumberInArrayException("Impossible to find your number");
        }
        return result;
    }
}
