package com.yogo.duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a Mallard Duck");
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

}
