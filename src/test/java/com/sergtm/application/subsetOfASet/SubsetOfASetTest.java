package com.sergtm.application.subsetOfASet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 11.09.2016.
 */
public class SubsetOfASetTest {
    @Test
    public void shouldReturnFive()  {
        SubsetOfASet variable = new SubsetOfASet();
        assertEquals(variable.subsetOfASet(8), 5);
    }

    @Test
    public void shouldReturnThirtyThree() {
        SubsetOfASet variable = new SubsetOfASet();
        assertEquals(variable.subsetOfASet(50), 33);
    }
}
