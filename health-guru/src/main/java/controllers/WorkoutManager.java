package controllers;

import java.util.ArrayList;
import java.util.List;

import enums.BodyGoalType;
import enums.ExerciseType;
import enums.WorkOutType;
import models.User;
import models.WorkOut;

public class WorkoutManager {

	private User user;
	private List<WorkOut> workOuts = new ArrayList<>();
	
	public List<WorkOut> generateWorkOuts(User user) {
		workOuts.clear();
		if(user.getGoal().equals(BodyGoalType.BULKING)) {
			//Exercises that would bulk up.
			workOuts.add(new WorkOut(ExerciseType.DEADLIFT, 4, WorkOutType.BULKING, 10));
			workOuts.add(new WorkOut(ExerciseType.SQUAT, 5, WorkOutType.BULKING, 6));
			workOuts.add(new WorkOut(ExerciseType.BENCHPRESS, 7, WorkOutType.BULKING, 4));
			workOuts.add(new WorkOut(ExerciseType.WEIGHTEDPULLUP, 6, WorkOutType.BULKING, 3));
			workOuts.add(new WorkOut(ExerciseType.DIAMONDPUSHUP, 10, WorkOutType.BULKING, 3));
		} else if(user.getGoal().equals(BodyGoalType.SLIMMING)) {
			//Exercises that would slim down.
			workOuts.add(new WorkOut(ExerciseType.RUNNING, 300, WorkOutType.SLIMMING, 1));
			workOuts.add(new WorkOut(ExerciseType.PUSHUP, 15, WorkOutType.SLIMMING, 5));
			workOuts.add(new WorkOut(ExerciseType.WEIGHTEDSITUP, 10, WorkOutType.SLIMMING, 4));
			workOuts.add(new WorkOut(ExerciseType.BURPEE, 20, WorkOutType.SLIMMING, 3));
			workOuts.add(new WorkOut(ExerciseType.DIP, 10, WorkOutType.SLIMMING, 2));
		} else if(user.getGoal().equals(BodyGoalType.TONING)) {
			//Exercises that would tone.
			workOuts.add(new WorkOut(ExerciseType.SITUP, 10, WorkOutType.TONING, 2));
			workOuts.add(new WorkOut(ExerciseType.PUSHUP, 10, WorkOutType.TONING, 2));
			workOuts.add(new WorkOut(ExerciseType.JUMPINGJACK, 20, WorkOutType.TONING, 3));
			workOuts.add(new WorkOut(ExerciseType.BURPEE, 5, WorkOutType.TONING, 3));
			workOuts.add(new WorkOut(ExerciseType.DIP, 8, WorkOutType.TONING, 3));
		} else {
			//Exercises at random.
			workOuts.add(new WorkOut(ExerciseType.SITUP, 20, WorkOutType.NONE, 5));
			workOuts.add(new WorkOut(ExerciseType.PUSHUP, 10, WorkOutType.NONE, 3));
			workOuts.add(new WorkOut(ExerciseType.JUMPINGJACK, 30, WorkOutType.NONE, 3));
			workOuts.add(new WorkOut(ExerciseType.DIP, 10, WorkOutType.NONE, 3));
			workOuts.add(new WorkOut(ExerciseType.LUNGE, 10, WorkOutType.NONE, 3));
		}
		return getWorkOuts();
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
