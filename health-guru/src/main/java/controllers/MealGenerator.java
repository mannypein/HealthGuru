package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.Ingredient;
import models.Meal;
import models.User;

public class MealGenerator {
	private Map<String, Meal> meals;
	private int userID;
	private List<String> dietaryRestrictions = new ArrayList<String>();
	private String apiKey = "&apiKey=99a6e2a6198f49a4ad1e63353a23acf1";

	public static void main(String[] args) {
		User u = new User();
		List<Ingredient> ingredients = new ArrayList<>();
		Ingredient i = new Ingredient();
		i.setName("apple");
		ingredients.add(i);

		MealGenerator mg = new MealGenerator();
		String generate = mg.generateMeals(u, ingredients, 0);
	}

	public String generateMeals(User user, List<Ingredient> ingredients, int maxCalories) {
		// call the API to generate meal
		String urlToGenerate = "https://api.spoonacular.com/recipes/complexSearch?includeIngredients=";
		// Ingredients
		if (ingredients != null) {

			for (Ingredient i : ingredients) {
				if (i == ingredients.get(0)) {
					urlToGenerate += ingredients.get(0).getName();
					if (ingredients.size() > 1) {
						urlToGenerate += ",";
					}
				} else {
					urlToGenerate += "+" + i.toString() + ",";
				}
			}
		}

		// Restrictions
		dietaryRestrictions = user.getFoodRestrictions();
		if (dietaryRestrictions.size() > 0) {
			urlToGenerate += "&excludeIngredients=";
			for (String s : dietaryRestrictions) {
				if (s.equals(dietaryRestrictions.get(0))) {
					urlToGenerate += dietaryRestrictions.get(0) + ",";
				} else {
					urlToGenerate += "+" + s + ",";
				}
			}
		}

		// Diet
		if (user.getDiet() != null) {
			urlToGenerate += "&diet=" + user.getDiet().toString().toLowerCase();
		}

		// Calories
		if (maxCalories != 0) {
			urlToGenerate += "&maxCalories=" + maxCalories;
		}
		
		urlToGenerate += "&number=4";

		// Final String for call to API
		urlToGenerate += "&" +apiKey;

		// Create and return list of meals

		return urlToGenerate;
	}

	public Meal getMeal(String name) {
		return meals.get(name);
	}

	public Map<String, Meal> getMeals() {
		return meals;
	}

	public void setMeals(Map<String, Meal> meals) {
		this.meals = meals;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void addDietaryRestriction(String restriction) {
		dietaryRestrictions.add(restriction);
	}

	public List<String> getDietaryRestrictions() {
		return dietaryRestrictions;
	}

	public void setDietaryRestrictions(List<String> dietaryRestrictions) {
		this.dietaryRestrictions = dietaryRestrictions;
	}
}
