package com.codingdojo.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla harambe = new Gorilla();
		
		harambe.eatBananas();
		harambe.eatBananas();
		
		harambe.climb();
		
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.throwSomething();
		
		System.out.println(harambe.getEnergyLevel());
		
	}

}
