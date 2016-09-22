package com.sergtm.application.allVariantsOfNumber;

import com.sergtm.application.carTask.Car;
import com.sergtm.application.carTask.CarBody;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by admin on 21.09.2016.
 */
public class AllVariantsOffNumberTest {
    @Test
    public void test1() {
        int[] arr = {1,2,3,4,5,6,7,8};
        List list = new ArrayList<>();
        list.add("1 + 8 = 9");
        list.add("2 + 7 = 9");
        list.add("3 + 6 = 9");
        list.add("4 + 5 = 9");
        list.add("5 + 4 = 9");
        list.add("6 + 3 = 9");
        list.add("7 + 2 = 9");
        list.add("8 + 1 = 9");

        AllVariantsOfNumberTask allVariantsOfNumberTask = new AllVariantsOfNumberTask();
        assertEquals(allVariantsOfNumberTask.allVariantsOfNumber(arr, 9), list);
    }
}
