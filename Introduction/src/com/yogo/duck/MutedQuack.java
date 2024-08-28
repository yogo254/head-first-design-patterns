package com.yogo.duck;

public class MutedQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
	
}
