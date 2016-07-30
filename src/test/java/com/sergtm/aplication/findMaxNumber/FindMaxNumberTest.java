package com.sergtm.aplication.findMaxNumber;

import junit.framework.Assert;

import org.junit.Test;

import com.sergtm.application.findMaxNumber.FindMaxNumber;

public class FindMaxNumberTest {

    @Test
    public void testMatrixFiveFive() {
        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 },
                { 6, 7, 8, 9, 1 }, { 2, 4, 3, 1, 3 }, { 5, 4, 3, 2, 1 } };
        boolean[][] availableElements = { { true, true, true, true, true },
                { false, true, true, true, false },
                { false, false, true, false, false },
                { false, true, true, true, false },
                { true, true, true, true, true } };

        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Assert.assertEquals(
                findMaxNumber.findMaxNum(matrix, availableElements), 8);
    }

    @Test
    public void testMatrixFourFour() {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 4, 2, 1 }, { 5, 4, 2, 1 },
                { 7, 6, 4, 1 } };
        boolean[][] availableElements = { { true, true, true, true },
                { false, true, true, false }, { false, true, true, false },
                { true, true, true, true } };
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Assert.assertEquals(
                findMaxNumber.findMaxNum(matrix, availableElements), 7);
    }

    @Test
    public void testMatrixSixFour() {
        int[][] matrix = { { 1, 2, 1, 1 }, { 5, 4, 2, 4 }, { 4, 5, 8, 6 },
                { 1, 2, 3, 4 }, { 5, 4, 3, 1 }, { 4, 3, 1, 3 } };
        boolean[][] availableElements = { { true, true, true, true },
                { false, true, true, false }, { false, true, true, false },
                { false, true, true, false }, { false, true, true, false },
                { true, true, true, true } };
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Assert.assertEquals(
                findMaxNumber.findMaxNum(matrix, availableElements), 8);
    }

    @Test
    public void testMatrixFiveSeven() {
        int[][] matrix = { { 1, 2, 3, 4, 5, 6, 7 }, { 4, 3, 2, 1, 2, 3, 4 },
                { 5, 4, 3, 2, 1, 3, 4 }, { 5, 6, 7, 4, 3, 2, 1 },
                { 4, 5, 6, 6, 4, 3, 1 } };
        boolean[][] availableElements = {
                { true, true, true, true, true, true, true },
                { false, true, true, true, true, true, false },
                { false, false, true, true, true, false, false },
                { false, true, true, true, true, true, false },
                { true, true, true, true, true, true, true } };
        FindMaxNumber findMaxNumber = new FindMaxNumber();
        Assert.assertEquals(findMaxNumber.findMaxNum(matrix, availableElements), 7);
    }
}
