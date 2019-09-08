package com.factory.pattern;

public class TestFactoryPattern {
	
    public static void main(String[] args) {
    	
        //System.out.println(CarFactory.buildCar(CarType.SMALL));
        
        Car car=CarFactory.buildCar(CarType.LUXURY);
        car.construct();
        //System.out.println(CarFactory.buildCar(CarType.SEDAN));
        //System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
