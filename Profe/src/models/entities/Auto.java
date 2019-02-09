package models.entities;

import java.util.Calendar;

import utilities.Utilities;

public class Auto extends MyDate{
	
	
	private String plate;
	private int model;
	private String brand;
	private String line;
	private int displacement;
	private String ownerName;
	private int id;
	
	
	public Auto(Calendar date, String plate, int model, String brand, String line, int displacement,
			String ownerName, int id) {
		super(date);
		this.plate = plate;
		this.model = model;
		this.brand = brand;
		this.line = line;
		this.displacement = displacement;
		this.ownerName = ownerName;
		this.id = id;
	}


	public String getPlate() {
		return plate;
	}


	public void setPlate(String plate) {
		this.plate = plate;
	}


	public double getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public double getDisplacement() {
		return displacement;
	}


	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public double getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public Object[] toObjectVector(){
		return new Object[] { Utilities.toStringCalendar( date ), plate,model,brand,line,displacement,ownerName,id };
	}

	
	


}
