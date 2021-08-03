package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("Screeeeeeech");
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		this.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Burn Burn Burn Burn");
		this.setEnergyLevel(getEnergyLevel() - 100);
	}

}
