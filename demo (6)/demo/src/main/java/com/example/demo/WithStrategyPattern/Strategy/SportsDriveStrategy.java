package com.example.demo.WithStrategyPattern.Strategy;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
