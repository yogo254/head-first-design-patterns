package com.yogo;

import com.yogo.duck.MallardDuck;
import com.yogo.duck.RockectFly;

public class Main {

	public static void main(String[] args) {

		var duck = new MallardDuck();

		duck.display();
		duck.performFly();
		duck.performQuack();
        //Dynamically changing the behaviour of the duck
		duck.setFlyBehaviour(() -> System.out.println("I can now fly"));
		duck.performFly();
		duck.setFlyBehaviour(new RockectFly());
		duck.performFly();

	}

}
