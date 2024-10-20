package com.example.demo.WithStrategyPattern;

import com.example.demo.WithStrategyPattern.GoodsVehicle;
import com.example.demo.WithStrategyPattern.Strategy.DriveStrategy;
import com.example.demo.WithStrategyPattern.Strategy.NormalDriveStrategy;
import com.example.demo.WithStrategyPattern.Vehicle1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Main {

	public static void main(String[] args) {

		Vehicle1 vehicle1=new GoodsVehicle();
		vehicle1.drive();
		Vehicle1 vehicle2=new OffRoadVehicle();
		vehicle2.drive();
		Vehicle1 vehicle3=new PassengerVehicle();
		vehicle3.drive();
		Vehicle1 vehicle4=new SportsVehicle();
		vehicle4.drive();

	}

}
