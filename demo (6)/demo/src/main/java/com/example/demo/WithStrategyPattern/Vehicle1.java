package com.example.demo.WithStrategyPattern;
import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle1 {
    DriveStrategy driveStrategy;

    Vehicle1(DriveStrategy driveObj){
        this.driveStrategy=driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
