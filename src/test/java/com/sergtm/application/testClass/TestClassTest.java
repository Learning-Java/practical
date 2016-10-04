package com.sergtm.application.testClass;

import com.sergtm.application.carTask.Car;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 18.08.2016.
 */
public class TestClassTest {
    @Test
    public void testReflexive() {
        TestClass a = new TestClass(100, true, 100);
        assertTrue(a.equals(a));
    }
    @Test
    public void testSymmetric() {
        TestClass a = new TestClass(100, true, 100);
        TestClass b = new TestClass(100, true, 100);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
    @Test
    public void testTransitive() {
        TestClass a = new TestClass(100, true, 100);
        TestClass b = a;
        TestClass c = b;
        assertTrue(a.equals(c));
    }
    @Test
    public void testNonNull() {
        TestClass a = new TestClass(100, true, 100);
        assertFalse(a.equals(null));
    }
    @Test
    public void testHashCodeEqualityInTheSameSession() {
        TestClass a = new TestClass(100, true, 100);
        int hashCode1 = a.hashCode();
        int hashCode2 = a.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
    @Test
    public void testHashCodeEqualityWithTwoEqualObjects() {
        TestClass a = new TestClass(100, true, 100);
        TestClass b = new TestClass(100, true, 100);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }
    @Test
    public void testHashCodeEqualityWithTwoNotEqualObjects() {
        TestClass a = new TestClass(100, true, 100);
        TestClass b = new TestClass(200, false, 200);
        int hashCode1 = a.hashCode();
        int hashCode2 = b.hashCode();
        assertFalse(a.equals(b));
        assertNotEquals(hashCode1, hashCode2);
    }
}
