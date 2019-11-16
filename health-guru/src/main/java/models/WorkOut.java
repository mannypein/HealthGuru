package models;

import enums.ExerciseType;
import enums.WorkOutType;

public class WorkOut {

	private ExerciseType name;
	private long duration;
	private WorkOutType type;
	private int sets;
	
	public WorkOut() {
		
	}
	
	public WorkOut(ExerciseType name, long duration, WorkOutType type, int sets) {
		setName(name);
		setDuration(duration);
		setType(type);
		setSets(sets);
	}
	
	public ExerciseType getName() {
		return name;
	}
	public void setName(ExerciseType name) {
		this.name = name;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public WorkOutType getType() {
		return type;
	}
	public void setType(WorkOutType type) {
		this.type = type;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	
	
	
	
}
