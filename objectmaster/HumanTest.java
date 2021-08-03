package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
		Wizard a = new Wizard();
		Ninja b = new Ninja();
		Samurai c = new Samurai();
		Samurai d = new Samurai();
		
		// Test Wizard class methods
		//a.fireball(b);
		//a.heal(c);
		
		//System.out.println(b.getHealth());
		//System.out.println(c.getHealth());
		
		// Test Ninja class methods
		//b.steal(a);
		//b.runAway();
		
		//System.out.println(a.getHealth());
		//System.out.println(b.getHealth());
		
		// Test Samurai class methods
		c.deathBlow(a);
		c.meditate();
		
		System.out.println(a.getHealth());
		System.out.println(c.getHealth());
		System.out.println(Samurai.howMany());

	}

}
