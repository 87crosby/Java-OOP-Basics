package com.codingdojo.objectmaster;

public class Ninja extends Human{
	
	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human obj) {
		obj.setHealth(obj.getHealth() - this.getStealth());
		this.setHealth(this.getHealth() + this.getStealth());
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10);
	}

}
