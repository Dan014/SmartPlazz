package models.dao;

import models.entities.Auto;

public class ManagerBussines {
	
	private AutoManager autoManager;
	
	public ManagerBussines() {
		autoManager = new AutoManager();
	}
	
	public void addCost(Auto economicCost) {
		autoManager.addAuto(economicCost);
	}
	

	
}
