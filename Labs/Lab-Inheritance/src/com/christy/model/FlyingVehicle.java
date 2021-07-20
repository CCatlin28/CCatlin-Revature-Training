package com.christy.model;

public class FlyingVehicle extends Vehicle{
	private short wings;
	private Engine engine;
	
	public FlyingVehicle() {}
	
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	//getters and setters
	public short getWings() { return this.wings;}
	public void setWing(short wings) {this.engine = engine; }
	
	public void fly() {
		System.out.println("Flying Vehicle is flying...");
	}
	public void refuel() {
		System.out.println("FlyingVehicle is refueling");
	}
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off...");
	}
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}
}
