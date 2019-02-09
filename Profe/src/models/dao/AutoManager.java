package models.dao;

import java.util.ArrayList;
import java.util.Calendar;

import models.entities.Auto;

public class AutoManager {
	
	private ArrayList<Auto> autolList;
	
	public AutoManager() {
		autolList = new ArrayList<>();
	}
	
	public static Auto createAuto(Calendar date, String plate, int model, String brand, String line, int displacement,
			String ownerName, int id){
		return new Auto(date, plate, model, brand, ownerName, id, ownerName, id);
		
	}
	
	public void addAuto(Auto cost){
		autolList.add(cost);
	}
	
	public String toStringList() {
		String list = "";
		for (Auto economicCost : autolList) {
			list += economicCost.toString() + "\n";
		}
		return list;
	}

}
