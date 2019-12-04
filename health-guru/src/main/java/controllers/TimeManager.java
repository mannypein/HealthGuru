package controllers;

import java.util.HashMap;
import java.util.Map;

import models.User;

public class TimeManager {
	private User user;
	private Map<String, String> userAvailability = new HashMap<>();
	private String currentDay;
	private String hoursAvailable;
	
	public void changeAvailability(Map<String, String> userAvailable) {		
		for(String s : userAvailable.keySet()) {
			userAvailability.put(s, userAvailable.get(s) + 1);
		}
	}
	
	public String seeSchedule() {
		String schedule = "";
		for(String s : userAvailability.keySet()) {
			schedule += s + ": ";
			schedule += userAvailability.get(s);
		}
		return schedule;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, String> getUserAvailability() {
		return userAvailability;
	}

	public void setUserAvailability(Map<String, String> userAvailability) {
		this.userAvailability = userAvailability;
	}

	public String getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(String currentDay) {
		this.currentDay = currentDay;
	}

	public String getHoursAvailable() {
		hoursAvailable = userAvailability.get(currentDay);
		return hoursAvailable;
	}
	
}
