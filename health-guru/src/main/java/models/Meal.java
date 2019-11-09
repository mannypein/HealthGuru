package models;

import java.util.HashMap;
import java.util.Set;

public class Meal {

	private String name;
	private double calorieCount;
	private HashMap<String,Ingredient> ingredients = new HashMap();
	
	public String getName() {
		return name;
	}
	public void setName(String meal) {
		this.name = meal;
	}
	public double getCalorieCount() {
		return calorieCount;
	}
	public void setCalorieCount() {
		this.calorieCount = calculateCalorieCount();

	}
	
	public Ingredient getIngerdient(String name) {
		return ingredients.get(name);
	}
	
	private double calculateCalorieCount() {
		Set<String> keysSet = ingredients.keySet();
		String[] keys = new String[keysSet.size()];
			keysSet.toArray(keys);
			Ingredient ingr;
		double total = 0;
		for(int i = 0; i < ingredients.size(); i++) {
			ingr = ingredients.get(keys[i]);
			total += ingr.getCalorieCount();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Meal Name: ").append(getName()+" ")
		.append("Calorie Count: ").append(getCalorieCount()+ " ");
		
		Set<String> keysSet = ingredients.keySet();
		String[] keys = new String[keysSet.size()];
			keysSet.toArray(keys);
			Ingredient ingr;
		for(int i = 0; i < ingredients.size(); i++) {
			ingr = ingredients.get(keys[i]);
			sb.append("Ingredient Name: ").append(ingr.getName())
			.append("Ingredient Calorie Count: " ).append(ingr.getCalorieCount());
		}
		return sb.toString();
	}
	
	
}
