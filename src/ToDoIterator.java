/**
 * @author Daniel Gregory
 * provides the methods needed for to create Next() and hasNext() to be used in another class
 */

import java.util.Iterator;
public class ToDoIterator implements Iterator {
	
	private ToDo[] todos;
	private int position = 0;
	
	/**
	 * initializes the ToDo array
	 * @param todos holds the new array
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	/**
	 * advances the array position to the next one
	 */
	public ToDo next() {
		ToDo toDo = todos[position];
		position = position + 1;
		return toDo;
	}
	/**
	 *  returns a boolean if the array has a next position available 
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
