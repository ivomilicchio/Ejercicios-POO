package ar.edu.info.unlp.ejercicio5;

import java.time.Duration;

public abstract class State {
	
	
	public void start(ToDoItem toDoItem) {
		
	}
	
	public abstract void togglePause(ToDoItem toDoItem);
	
	public Duration workedTime(ToDoItem toDoItem) {
		
		return toDoItem.getWorkedTimeSoFar();
	}
	
	public void finish(ToDoItem toDoItem) {
		
		toDoItem.setEndTime();
		toDoItem.setState(new Finished());
	}
	
	public void addComment(ToDoItem toDoItem, String comment) {
		
		toDoItem.addCommentToList(comment);
	}

}
