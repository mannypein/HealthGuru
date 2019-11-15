package models;

public class Ingredient {

	private String name;
	private double calorieCount;
	
	public Ingredient() {
		
	}
	
	public Ingredient(String name, double calorieCount) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalorieCount() {
		return calorieCount;
	}
	public void setCalorieCount(double calorieCount) {
		this.calorieCount = calorieCount;
	}

	@Override
	public String toString() {
		return "name: "+getName() + " , calorie count: "+ getCalorieCount();
	}
	
	
	
}
