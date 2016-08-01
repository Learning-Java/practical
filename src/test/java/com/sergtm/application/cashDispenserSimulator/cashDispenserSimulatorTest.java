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
        List<Cash> cashes = new ArrayList<Cash>();
        cashes.add(new Cash(500, 4));
        cashes.add(new Cash(1000, 2));
        cashes.add(new Cash(5000, 1));


        List<Cash> result = Arrays.asList(new Cash(500, 2), new Cash(1000, 1));

        Assert.assertEquals(

               atmSimulator.cashCounter(1000 ,cashes), result);
    }

    @Test
    public void shouldReturnThreeResults() throws GoToOtherATMException{
        ATMSimulator atmSimulator = new ATMSimulator();
        List<Cash> cashes = new ArrayList<Cash>();
        cashes.add(new Cash(50, 2));
        cashes.add(new Cash(100,4));
        cashes.add(new Cash(500, 4));
        cashes.add(new Cash(1000, 2));
        cashes.add(new Cash(5000, 1));

        int[] firstRow = {500, 500, 500, 500, 100, 100, 100, 100, 50};
        int[] secondRow = {500, 500, 1000, 100, 100, 100, 100, 50};
        int[] thirdRow = {1000, 1000, 100, 100, 100, 100, 50};

        List<int[]> result = new ArrayList<int[]>();
        result.add(firstRow);
        result.add(secondRow);
        result.add(thirdRow);

        Assert.assertEquals(
                atmSimulator.cashCounter(2450, cashes), result);
    }

    @Test (expected = GoToOtherATMException.class)
    public void shouldThrowGoToOtherATMException() throws GoToOtherATMException{
        ATMSimulator atmSimulator = new ATMSimulator();

        List<Cash> cashes = new ArrayList<Cash>();
        cashes.add(new Cash(100,4));
        cashes.add(new Cash(500, 4));
        cashes.add(new Cash(1000, 2));
        cashes.add(new Cash(5000, 1));

        atmSimulator.cashCounter(2450, cashes);
    }
}

