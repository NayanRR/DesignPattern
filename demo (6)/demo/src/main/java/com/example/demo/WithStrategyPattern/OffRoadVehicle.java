package com.example.demo.WithStrategyPattern;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;
import com.example.demo.WithStrategyPattern.Strategy.XyzDriveStrategy;

public class OffRoadVehicle extends Vehicle1 {


    OffRoadVehicle() {
        super(new XyzDriveStrategy());
    }
}
