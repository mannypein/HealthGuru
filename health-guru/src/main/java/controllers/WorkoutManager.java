package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;
import models.WorkOut;

public class WorkoutManager {

	private User user;
	private List<WorkOut> workOuts = new ArrayList();
	
	public List<WorkOut> generateWorkOuts(User user){
		return null;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void insertWorkOut(WorkOut workout) {
		workOuts.add(workout);
	}

	public List<WorkOut> getWorkOuts() {
		return workOuts;
	}

	public void setWorkOuts(List<WorkOut> workOuts) {
		this.workOuts = workOuts;
	}
	
	
}
