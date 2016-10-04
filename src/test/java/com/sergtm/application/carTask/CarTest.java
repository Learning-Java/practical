package com.sergtm.application.carTask;

import com.sergtm.application.carTask.Car;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 17.08.2016.
 */
public class CarTest {
    @Test
    public void testReflexive() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        assertTrue(a.equals(a));
    }
    @Test
    public void testSymmetric() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        Car b = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }
    @Test
    public void testTransitive() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        Car b = a;
        Car c = b;
        assertTrue(a.equals(c));
        }
    @Test
    public void testNonNull() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        a.setEngineCapacity(1.8);
        assertFalse(a.equals(null));
    }
    @Test
    public void testHashCodeEqualityInTheSameSession() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        int hashCode1 = a.hashCode();
        int hashCode2 = a.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
    @Test
    public void testHashCodeEqualityWithTwoEqualObjects() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        Car b = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
    }
    @Test
    public void testHashCodeEqualityWithTwoNotEqualObjects() {
        Car a = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        Car b = new Car(CarBody.SEDAN, "Red", 1.5, 1112L);
        int hashCode1 = a.hashCode();
        int hashCode2 = b.hashCode();
        assertFalse(a.equals(b));
        assertNotEquals(hashCode1, hashCode2);
    }
}
