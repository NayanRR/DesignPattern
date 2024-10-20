package com.example.demo.WithStrategyPattern;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;
import com.example.demo.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle1 {


    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
