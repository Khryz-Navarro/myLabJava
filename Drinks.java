import javax.swing.*;

public class Drinks {
	public static void main (String[] args) {
		
		Beverages Be1 = new Beverages();
		Beverages Be2 = new Beverages("The Coca-Cola Company", "Mountain Dew",500,"Plastic Bottle");
		AlcoholicBeverage Al1 = new AlcoholicBeverage();
		AlcoholicBeverage Al2 = new AlcoholicBeverage("San Miguel Brewery","Red Horse Extra Strong",1000,"Glass Bottle",6.9);
		
		
		
			Be1.setBrand("");
			Be1.setName("");
			Be1.setnetContent(0);
			Be1.setcontainerType("");
			
			Al1.setBrand("");
			Al1.setName("");
			Al1.setnetContent(0);
			Al1.setcontainerType("");
			Al1.setAlchoholContent(0);
			
			JOptionPane.showMessageDialog(null, Be1.displayDrinks()+ "\n\n"+Be2.displayDrinks()+"\n\n"+Al1.displayDrinks()+"\n\n"+Al2.displayDrinks());
}			
}