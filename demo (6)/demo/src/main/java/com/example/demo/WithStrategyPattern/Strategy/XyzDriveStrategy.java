package com.example.demo.WithStrategyPattern.Strategy;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;

public class XyzDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ NEW DESIGN Capability");
    }
}
