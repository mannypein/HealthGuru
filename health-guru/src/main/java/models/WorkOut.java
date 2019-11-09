package models;

import enums.WorkOutType;

public class WorkOut {

	private String name;
	private long duration;
	private WorkOutType type;
	private int sets;
	
	public WorkOut() {
		
	}
	
	public WorkOut(String name, long duration, WorkOutType type, int sets) {
		setName(name);
		setDuration(duration);
		setType(type);
		setSets(sets);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
