package com.exo.millitaire.factory;

import com.exo.millitaire.officer.Officer;
import com.exo.millitaire.officer.Senechal;
import com.exo.millitaire.soldier.Archer;
import com.exo.millitaire.soldier.Soldier;

public class IronAgeFactory implements ArmyFactory {

	@Override
	public Soldier createSoldier() {
		return new Archer();
	}

	@Override
	public Officer createOfficer() {
		return new Senechal();
	}

}
