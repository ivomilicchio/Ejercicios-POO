package ar.edu.info.unlp.ejercicio5;

public class InProgress extends State {
	
	public void togglePause(ToDoItem toDoItem) {
	
		toDoItem.setState(new Paused());
	}

}
