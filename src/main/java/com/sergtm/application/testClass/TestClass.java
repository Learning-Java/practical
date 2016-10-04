package com.sergtm.application.testClass;

/**
 * Created by admin on 18.08.2016.
 */
public class TestClass {
    private long lon;
    private boolean bool;
    private int in;

    public TestClass(long lon, boolean bool, int in){
        this.lon = lon;
        this.bool= bool;
        this.in = in;
    }
    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof TestClass))
            return false;
        TestClass otherTest = (TestClass) obj;
        return this.lon == otherTest.lon
                && this.in == otherTest.in
                && this.bool == otherTest.bool;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + in;
        result = 31 * result + (int)(lon ^ (lon >>> 32));
        result = 31 * result + (bool ? 1 : 0);
        return result;
    }

}
