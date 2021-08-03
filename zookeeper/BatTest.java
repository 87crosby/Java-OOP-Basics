package com.codingdojo.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		
		Bat coronabat = new Bat();
		
		coronabat.attackTown();
		coronabat.attackTown();
		coronabat.attackTown();
		
		coronabat.eatHumans();
		coronabat.eatHumans();
		
		coronabat.fly();
		coronabat.fly();
		
		System.out.println(coronabat.getEnergyLevel());

	}

}
