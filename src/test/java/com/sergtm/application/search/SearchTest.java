package com.sergtm.application.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 03.09.2016.
 */
public class SearchTest {
    @Test
    public void shouldReturnTwo() throws NoSuchNumberInArrayException {
        Search search = new Search();
        int[] array = {1,2,3,4};
        assertEquals(search.search(array, 2), 2);
    }

    @Test
    public void shouldReturnThree() throws NoSuchNumberInArrayException {
        Search search = new Search();
        int[] array = {1,2,2,3};
        assertEquals(search.search(array, 3), 3);
    }

    @Test(expected = NoSuchNumberInArrayException.class)
    public void shouldThrowNoSuchNumberInArrayException() throws NoSuchNumberInArrayException {
        Search search = new Search();
        int[] array = {1,2,2,1};
        search.search(array, 3);

    }
}
