package com.exo.millitaire.factory;

import com.exo.millitaire.officer.Centurion;
import com.exo.millitaire.officer.Officer;
import com.exo.millitaire.soldier.Legionaire;
import com.exo.millitaire.soldier.Soldier;

public class RomeFactory implements ArmyFactory {

	@Override
	public Soldier createSoldier() {
		return new Legionaire();
	}

	@Override
	public Officer createOfficer() {
		return new Centurion();
	}

}
