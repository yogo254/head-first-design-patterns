package com.yogo.duck;

public abstract class Duck {
	 FlyBehaviour flyBehaviour;
	 QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("Swimming");
	}

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

}
