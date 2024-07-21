package ar.edu.info.unlp.ejercicio5;

import java.time.Duration;

public class Finished extends State {
	
	public void togglePause(ToDoItem toDoItem) {
		
		throw new RuntimeException("La tarea ya fue finalizada");
	}
	
	@Override
	public Duration workedTime(ToDoItem toDoItem) {
		
		return toDoItem.getWorkedTime();
	}
	
	@Override
	public void finish(ToDoItem toDoItem) {
	
	}
	
	@Override
	public void addComment(ToDoItem toDoItem, String comment) {
		
	}

}
