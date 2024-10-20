package com.example.demo.WithStrategyPattern;

import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;
import com.example.demo.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle1 {



    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
