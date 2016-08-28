package com.sergtm.application.cashDispenserSimulator;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 01.08.2016.
 */
public class cashDispenserSimulatorTest {
    @Test
    public void shouldReturnTwoResults() throws GoToOtherATMException {
        ATMSimulator atmSimulator = new ATMSimulator();
        List<Integer> cashes = Arrays.asList(5000, 1000, 500);




        List<Integer> result = new ArrayList<Integer>();

        result.add(1000);

        Assert.assertEquals(

               atmSimulator.cashCounter(1000 ,cashes), result);
    }

    @Test
    public void shouldReturnThreeResults() throws GoToOtherATMException{
        ATMSimulator atmSimulator = new ATMSimulator();
        List<Integer> cashes = Arrays.asList(5000, 1000, 500, 100, 50);

        List<Integer> result = Arrays.asList(1000, 1000, 100, 100, 100, 100, 50 );



        Assert.assertEquals(
                atmSimulator.cashCounter(2450, cashes), result);
    }

    @Test (expected = GoToOtherATMException.class)
    public void shouldThrowGoToOtherATMException() throws GoToOtherATMException{
        ATMSimulator atmSimulator = new ATMSimulator();

        List<Integer> cashes = Arrays.asList(5000, 1000, 500, 100);

        atmSimulator.cashCounter(2450, cashes);
    }
}

