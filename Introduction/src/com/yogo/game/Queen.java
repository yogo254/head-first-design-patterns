package com.yogo.game;

public class Queen extends Character {



	@Override
	public void fight() {
		weaponBehaviour.useWeapon();
	}

	public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
		this.weaponBehaviour = weaponBehaviour;
	}
	
}
