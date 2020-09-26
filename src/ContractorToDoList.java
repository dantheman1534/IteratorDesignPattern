/**
 * @author Daniel Gregory
 * Provides the methods that create the contractor todo list and populate the array 
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ContractorToDoList{
	
	public static final int MAX_TODOS = 2;
	private String address;
	private ToDo[] todos;
	private int count;
	/**
	 * constructor that initializes the needed variables
	 * @param stores the given address of the job site
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		todos = new ToDo[MAX_TODOS];
	}
	/**
	 * Initializes the rest of the vales from the ToDo class and grows an array
	 * @param title of the job
	 * @param description of what the job is
	 * @param price of the job
	 * @param contact who we are doing the job for
	 * @param supplies what materials we need to complete the job
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact, supplies);
		if (count >= MAX_TODOS) {
			todos = growArray(todos);			
		}
			todos[count] = todo;
			count = count + 1;
	}
	/**
	 * allows for a new iterator to be called
	 * @returns a new iterator
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}
	/**
	 * allows for the address to be called
	 * @return simply the given address is returned
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * calucaltes the total cost of the specific job
	 * @return the total amount the job will cost
	 */
	public double getTotalCost() {
		int cost = 0;
		for(int i = 0; i < count; i++) {
			if(todos[i] != null) {
				cost += todos[i].getPrice();
			}
		}
		return cost;
	}
	/**
	 * creates a new array that can hold more information
	 * @param todos is simply the array type
	 * @returns the new array of the larger size
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] newList = new ToDo[MAX_TODOS * 2];
		for(int i = 0; i < todos.length; i++) {
			 newList[i] = todos[i];
		}
		return newList;
	}
}
