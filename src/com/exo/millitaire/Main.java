package com.exo.millitaire;

import com.exo.millitaire.factory.ArmyFactory;
import com.exo.millitaire.factory.IronAgeFactory;
import com.exo.millitaire.factory.RomeFactory;
import com.exo.millitaire.officer.Officer;
import com.exo.millitaire.soldier.Soldier;

//design pattern abstract factory
public class Main {

	public static void main(String[] args) {
		ArmyFactory armyFactory = new RomeFactory();
		Soldier soldier = armyFactory.createSoldier();
		Officer officer = armyFactory.createOfficer();

		soldier.describe();
		officer.describe();

		ArmyFactory armyFactory2 = new IronAgeFactory();
		Soldier soldier2 = armyFactory2.createSoldier();
		Officer officer2 = armyFactory2.createOfficer();

		soldier2.describe();
		officer2.describe();

	}
}
