package controllers;

import java.util.List;

import models.Ingredient;
import models.Meal;

public class MealGenerator {
	private List<Meal> meals;
	private int userID;
	private List<String> dietaryRestrictions;
	private double calorieLimit;
	
	public Meal generateMeal(double calorieLimit, List<Ingredient> ingredients) {
		//call the API to generate meal
		return null;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public List<String> getDietaryRestrictions() {
		return dietaryRestrictions;
	}

	public void setDietaryRestrictions(List<String> dietaryRestrictions) {
		this.dietaryRestrictions = dietaryRestrictions;
	}

	public double getCalorieLimit() {
		return calorieLimit;
	}

	public void setCalorieLimit(double calorieLimit) {
		this.calorieLimit = calorieLimit;
	}
	
	

}
