package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MealGenerator {

	private HashMap<String,Meal> meals = new HashMap();
	private List<String> dietaryRestrictions = new ArrayList();
	private int userID;
	private double calorieLimit;
	
	public void generateMeals() {
		
	}
	
	public void insertDietaryRestriction(String name) {
		dietaryRestrictions.add(name);
	}
	
	public Meal getMeal(String name) {
		return meals.get(name);
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public double getCalorieLimit() {
		return calorieLimit;
	}
	public void setCalorieLimit(double calorieLimit) {
		this.calorieLimit = calorieLimit;
	}
	
	
	
	
}
