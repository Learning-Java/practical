package com.sergtm.application.inputFormat;


/**
 * Created by admin on 01.09.2016.
 */
public class InputFormat {

    public String inputFormat(String[] input){
        String name = "";
        int age = 0;
        for(int i = 0; i < input.length; i++) {
            String[] result = input[i].split(" ");
            int currentAge = Integer.valueOf(result[1]);

            if (currentAge > age) {
                age = currentAge;
                name = result[0];
            }

        }
        if(name == ""){
            throw new IllegalArgumentException();
        }
        return name;
    }
}
