/**
 * @author Daniel Gregory
 * Contains the variables for the various info of the ToDo list of the contractor
 */
import  java.util.ArrayList;
public class ToDo {

	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	/**
	 * initializes the various variables
	 * @param title the title of the job
	 * @param description holds the description of the job
	 * @param price holds the price of the job
	 * @param contact holds the persons name the job is for
	 * @param supplies holds the supplies needed to complete the job
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	/**
	 * calls to get the price
	 * @return the price of the job
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * simply prints out the information in the given format
	 */
	public String toString() {
		String display = "Supply List: \n";
		for(String supply : supplies) {
			display += " - " + supply + "\n";
		}
		return(this.title +"\n"  + this.description+"\n" +"Business Contact: "+ this.contact+"\n" + display+ "\nPrice: $" +this.price+"\n" );
	}
}
