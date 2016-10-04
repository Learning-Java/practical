package com.sergtm.application.subsetOfASet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 11.09.2016.
 */
public class SubsetOfASetTest {
    @Test
    public void shouldReturnFive()  {
        SubsetOfASet var = new SubsetOfASet();
        assertEquals(var.subsetOfASet(8), 5);
    }

    @Test
    public void shouldReturnThirtyThree() {
        SubsetOfASet var = new SubsetOfASet();
        assertEquals(var.subsetOfASet(50), 33);
    }
}
