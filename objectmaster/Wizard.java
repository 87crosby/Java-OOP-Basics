package com.codingdojo.objectmaster;

public class Wizard extends Human{

	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human obj) {
		obj.setHealth(obj.getHealth() + this.getIntelligence());
	}
	
	public void fireball(Human obj) {
		obj.setHealth(obj.getHealth() - (this.getIntelligence() * 3));
	}
	
}
