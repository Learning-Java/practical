package com.sergtm.application.whoIsBetter;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by admin on 11.08.2016.
 */
public class WhoIsBetterTest {
    @Test
    public void testWhoIsBetterResFour() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(3, 4), 4);
    }
    @Test
    public void testWhoIsBetterResThree() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(3, 12), 3);
    }
    @Test
    public void testWhoIsBetterNormal() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(12346, 12345), 16);
    }
    @Test
    public void testWhoIsBetterEqual() {
        WhoIsBetter whoIsBetter = new WhoIsBetter();
        Assert.assertEquals(
                whoIsBetter.compare(98, 98), 17);
    }
}
