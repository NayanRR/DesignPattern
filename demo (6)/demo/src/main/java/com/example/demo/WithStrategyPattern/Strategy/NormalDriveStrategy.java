package com.example.demo.WithStrategyPattern.Strategy;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
