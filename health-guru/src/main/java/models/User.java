package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import enums.BodyGoalType;

public class User {

	private String username;
	private String password;
	private double totalCalorieIntake;
	private HashMap<String,Meal> favMeals = new HashMap();
	private BodyGoalType goal;
	private List<String> foodRestrictions = new ArrayList<String>();
	private float weightGoal;
	private float startingWeight;
	private float currentWeight;
	private float height;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public void setFoodRestriction(String name) {
		foodRestrictions.add(name);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getTotalCalorieIntake() {
		return totalCalorieIntake;
	}
	public void setTotalCalorieIntake(double totalCalorieIntake) {
		this.totalCalorieIntake = totalCalorieIntake;
	}
	public BodyGoalType getGoal() {
		return goal;
	}
	public void setGoal(BodyGoalType goal) {
		this.goal = goal;
	}
	public float getWeightGoal() {
		return weightGoal;
	}
	public void setWeightGoal(float weightGoal) {
		this.weightGoal = weightGoal;
	}
	public float getStartingWeight() {
		return startingWeight;
	}
	public void setStartingWeight(float startingWeight) {
		this.startingWeight = startingWeight;
	}
	public float getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(float currentWeight) {
		this.currentWeight = currentWeight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
