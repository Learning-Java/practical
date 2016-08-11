package com.sergtm.application.whoIsBetterTest;

import com.sergtm.application.whoIsBetter.WhoIsBetter;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by admin on 11.08.2016.
 */
public class WhoIsBetterTest {
    @Test
    public void testWhoIsBetterFour() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(3, 4), 4);
    }
    @Test
    public void testWhoIsBetterThree() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(3, 12), 3);
    }
    @Test
    public void testWhoIsBetterNormal() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(12346, 12345), 12346);
    }
    @Test
    public void testWhoIsBetterEqual() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(98, 98), 98);
    }
}
