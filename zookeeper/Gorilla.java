package com.codingdojo.zookeeper;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super(100);
	}

	public void throwSomething() {
		System.out.println("The Gorilla threw something");
		this.setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla ate a Banana");
		this.setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("The Gorilla is climbing");
		this.setEnergyLevel(getEnergyLevel() - 10);
	}
}
