package com.yogo.duck;

public class MallardDuck  extends Duck{

	public MallardDuck() {
		this.setFlyBehaviour(new FlyWithWings());
		this.setQuackBehaviour(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I am a Mallard Duck");
	}
	
}
