package ar.edu.info.unlp.ejercicio5;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	
	private String name;
	private State state;
	private LocalDate startTime;
	private LocalDate endTime;
	private List<String> comments;
	
	public ToDoItem(String name) {
		
		this.name = name;
		state = new Pending();
		comments = new ArrayList<String>();
	}
	
	public void start() {
		
		state.start(this);
	}
	
	public void togglePause() {
		
		state.togglePause(this);
	}
	
	public void finish() {
		
		state.finish(this);
	}
	
	public Duration workedTime() {
		
		return state.workedTime(this);
	}
	
	public void addComment(String comment) {
		
		state.addComment(this, comment);
	}
	
	public void setState(State state) {
		
		this.state = state;
	}
	
	public void setStartTime() {
		
		startTime = LocalDate.now();
	}
	
	public void setEndTime() {
		
		endTime = LocalDate.now();
	}
	
	public void addCommentToList(String comment) {
		
		comments.add(comment);
	}
	
	public Duration getWorkedTimeSoFar() {
		
		return Duration.between(startTime, LocalDate.now());
	}
	
	public Duration getWorkedTime() {
		
		return Duration.between(startTime, endTime);
	}

}
