package com.sergtm.application.inputFormat;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 01.09.2016.
 */
public class InputFormatTest {

    @Test
    public void shouldReturnMark(){
        InputFormat inputFormat = new InputFormat();
        String result = "Mark";
        String[] array = {"John 18", "Mark 45", "Ivan 30"};
        assertEquals(inputFormat.inputFormat(array), result);
    }

    @Test
    public void shouldReturnJohn(){
        InputFormat inputFormat = new InputFormat();
        String result = "John";
        String[] array = {"John 34", "Mark 20", "Ivan 30"};
        assertEquals(inputFormat.inputFormat(array), result);
    }

    @Test
    public void shouldReturnIvan(){
        InputFormat inputFormat = new InputFormat();
        String result = "Ivan";
        String[] array = {"John 113", "Mark 125", "Ivan 171"};
        assertEquals(inputFormat.inputFormat(array), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        InputFormat inputFormat = new InputFormat();
        String[] array = {"John 0", "Mark 0", "Ivan 0"};
        inputFormat.inputFormat(array);
    }

}
