package controllers;

import models.User;

public class UserProgressTracker {

	private User user;
	private float startingWeight;
	private float weightgoal;
	private float currentWeight;
	
	public float trackProgress(float startingWeight, float weightGoal, float currentWeight) {
		return 0;
		
		
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public float getStartingWeight() {
		return startingWeight;
	}
	public void setStartingWeight(float startingWeight) {
		this.startingWeight = startingWeight;
	}
	public float getWeightgoal() {
		return weightgoal;
	}
	public void setWeightgoal(float weightgoal) {
		this.weightgoal = weightgoal;
	}
	public float getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(float currentWeight) {
		this.currentWeight = currentWeight;
	}
	
	
}
