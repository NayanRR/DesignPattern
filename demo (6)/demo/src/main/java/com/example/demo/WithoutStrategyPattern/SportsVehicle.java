package com.example.demo.WithoutStrategyPattern;
import com.example.demo.WithStrategyPattern.StrategyPattern.Vehicle;
public class SportsVehicle extends Vehicle{

    @Override
    public void drive() {
        //super.drive();
        System.out.println("Special/Sports Drive Capability");
        //Overrides the parent Method
    }
}
