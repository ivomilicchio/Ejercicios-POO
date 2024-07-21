package ar.edu.info.unlp.ejercicio5;

import java.time.Duration;

public class Pending extends State {
	
	@Override
	public void start(ToDoItem toDoItem) {
		
		toDoItem.setStartTime();
		toDoItem.setState(new InProgress());
	}
	
	public void togglePause(ToDoItem toDoItem) {
		
		throw new RuntimeException("La tarea aun no fue iniciada");
	}
	
	@Override
	public void finish(ToDoItem toDoItem) {
		
	}
	
	@Override
	public Duration workedTime(ToDoItem toDoItem) {
		
		throw new RuntimeException("No se puede obtener el tiempo transcurrido ya que la tarea aun no fue iniciada");
	}

}
