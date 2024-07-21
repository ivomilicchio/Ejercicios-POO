package ar.edu.info.unlp.ejercicio5;

public class Paused extends State {
	
	public void togglePause(ToDoItem toDoItem) {
		
		toDoItem.setState(new InProgress());
	}

}
