package com.knoldus;

import org.junit.Assert;
import org.junit.Test;

public class RangeProductionTest{

    @Test
    public void getRangeProduction() {
        long actualOutput1 = RangeProduction.getRangeProduction(0,0);
        Assert.assertEquals(0,actualOutput1);

        long actualOutput2 = RangeProduction.getRangeProduction(2,2);
        Assert.assertEquals(2,actualOutput2);

        long actualOutput3 = RangeProduction.getRangeProduction(1,4);
        Assert.assertEquals(24,actualOutput3);

        long actualOutput4 = RangeProduction.getRangeProduction(1,2);
        Assert.assertNotEquals(0,actualOutput4);

        long actualOutput5 = RangeProduction.getRangeProduction(5,15);
        Assert.assertEquals(54486432000L,actualOutput5);
    }

}