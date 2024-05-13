import javax.swing.*;

public class AlcoholicBeverage extends Beverages{
	
	private double alcoholContent;
	
	public AlcoholicBeverage(){
		super();
		}
		
		
	public AlcoholicBeverage(String brand, String name, int netContent, String containerType, double alcoholContent){
			super(brand, name, netContent, containerType);
			this.alcoholContent = alcoholContent;
	}
	
	public double getAlchoholContent(){
		return alcoholContent;
	}
	public void setAlchoholContent(double alchoholContent){
		alchoholContent = Double.parseDouble(JOptionPane.showInputDialog("Beverage Alcohol Content: "));
		this.alcoholContent = alchoholContent;
	}
	public String displayDrinks(){
		return super.displayDrinks() + "\nAlcohol Content: " + getAlchoholContent()+ "%";
	}
}