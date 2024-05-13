/*
 *  1. Create a superclass named Beverages
 *	2. Declare instance variables brand, name, netContent, containerType and class variable count.
	3. Create 2 constructors: default, and one with all fields as parameters
	4. Create accessors and mutators for each field
	5. Create method that display all fields with labels
	6. Create a subclass named Alcoholic Beverage.
	7. Declare instance variables named alcoholContent.
	8. Create 2 constructors and inherit all fields from superclass.
	9. Create accessors and mutators.
	10.Override the method in the superclass that will display all variables.
	11.Create main class named Drinks.
	12.Create 1 object per constructor per class
	13.Assign values to objects (using JOptionPane, or input file)
	14.Output data of all objects (either using System.out, JOptionPane or on a file)
 
 */
 
import javax.swing.*;

public class Beverages {
	private String brand;
	private String name;
	private int netContent;
	private String containerType;
	
	public static int count;
	
	public Beverages() {
		count++;
	}
	
	public Beverages(String brand, String name, int netContent, String containerType){
		
		this.brand = brand;
		this.name = name;
		this.netContent = netContent;
		this.containerType = containerType;
		count++;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand){
		brand = JOptionPane.showInputDialog("Bevarage Brand: ");
		this.brand = brand;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		name = JOptionPane.showInputDialog("Bevarage Name: ");
		this.name = name;
	}
	public int getnetContent() {
		return netContent;
	}
	public void setnetContent(int netContent){
		netContent = Integer.parseInt(JOptionPane.showInputDialog("Net Content(ml): "));
		this.netContent = netContent;
	}
	public String getcontainerType(){
		return containerType;
	}
	public void setcontainerType(String containerType){
		containerType = JOptionPane.showInputDialog("Container Type: ");
	}
	public static int getCount(){
		return count;
	}
	public String displayDrinks(){
		return "Brand:" + getBrand() + "\nName:" + getName() + "\nNet Content" + getnetContent() + "\n ml\nContainer Type: " + getcontainerType();
	}
	}
