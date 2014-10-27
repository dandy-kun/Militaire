package com.exo.millitaire.factory;

import com.exo.millitaire.officer.Officer;
import com.exo.millitaire.soldier.Soldier;

public interface ArmyFactory {

	Soldier createSoldier();

	Officer createOfficer();
}
