package com.codingdojo.objectmaster;

public class Samurai extends Human{
	public static int numSamurai = 0;
	
	public Samurai() {
		this.setHealth(200);
		numSamurai++;
	}
	
	public void deathBlow(Human obj) {
		obj.setHealth(0);
		this.setHealth(this.getHealth() / 2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth() + (this.getHealth() / 2));
	}

	public static int howMany() {
		return numSamurai;
	}
	
}
