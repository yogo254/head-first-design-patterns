package com.yogo;

import com.yogo.duck.MallardDuck;

public class Main {

	public static void main(String[] args) {

		var duck = new MallardDuck();

		duck.display();
		duck.performFly();
		duck.performQuack();

	}

}
