package com.example.demo.WithStrategyPattern;

import com.example.demo.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle1 {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
