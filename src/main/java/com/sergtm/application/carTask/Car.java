package com.sergtm.application.carTask;

/**
 * Created by admin on 13.08.2016.
 */
public class Car implements Comparable<Car>{
    private CarBody carBody;
    private String color;
    private double engineCapacity;
    private long vid;

    public Car(CarBody carBody, String color, double engineCapacity, long vid) {
        this.carBody = carBody;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.vid = vid;
    }

    public String getColor() {
        return color;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public long getVid() {
        return vid;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Car body: ").append(carBody).append(", color: ").append(color).append(", engine capacity: ").append(engineCapacity);
        return builder.toString();
    }
    @Override
    public boolean equals(Object obj) {
         if ( !(obj instanceof Car))
             return false;
         Car otherCar = (Car) obj;
         return this.vid == otherCar.vid;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int)(vid ^ (vid >>> 32));
        return result;
    }

    @Override
    public int compareTo(Car o) {
        long result = vid - o.vid;
        return Float.floatToIntBits(Math.signum(result));
    }
}
