package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	public Mammal(int startingEnergy) {
		this.energyLevel = startingEnergy;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
