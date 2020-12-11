import javax.swing.JOptionPane;

public class TestCar {
public static void main(String[] args) {
	
	boolean validEntry = false ;
	boolean validProductSelection = false ;
	boolean isPresent=false;
	int priceAvailable=0;
	
	Car [] cars = new Car [1];
	String userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new car  \n $ to sell car  "
			+ "\n # to view all product ");	
	
	while (!validEntry) {
	
	switch (userEntry) {
	case "+":
		String carCountString = JOptionPane.showInputDialog("please enter cars number" );
		int carCount = Integer.parseInt(carCountString);
		 cars = new Car [carCount];
		 String name = "";
		 String brand = "";
		 String model = "";
		 String bodyType="";
		 Double price = 0.0 ;
	
		 Double speed= 0.0;
		
		 for (int i = 0; i < cars.length; i++) {
				validEntry = true ;
				String productType = 	JOptionPane.showInputDialog("please to add new car "
						+ "enter 1 \n to add used car enter 2 ");
				
//switch (userEntry) {
			/*	case "+":
					
					String productCountString = JOptionPane.showInputDialog("please enter products number" );
					int productCount = Integer.parseInt(productCountString);
					 products = new Product [productCount];
					 String name = "";
					 double price= 0.0;
					 String priceString ="";
					 for (int i = 0; i < products.length; i++) {
							validEntry = true ;
							String productType = 	JOptionPane.showInputDialog("to add Vegetables Please  "
									+ "enter 1 \n to add electronics Please enter 2 \n to add clothes enter 3 \n");
				
							
							switch (productType) {
							case "1":
							
								 name = JOptionPane.showInputDialog("please enter peoduct name ");
								 priceString = JOptionPane.showInputDialog("please enter product price ");
								 price = Double.parseDouble(priceString);
								String countString = JOptionPane.showInputDialog("please enter product count ");
								double count = Double.parseDouble(countString);
								String expirtdate = JOptionPane.showInputDialog("please enter expiry date  ");
								

								Product vegetables = new VegetableProducts(count, expirtdate, name, price);
								products [i]= vegetables;
								break;
				*/
							
					
				
				
				
				switch (productType) {
				case "1":
					String speedString = JOptionPane.showInputDialog("please enter car speed ");
					speed = Double.parseDouble(speedString);
					 name = JOptionPane.showInputDialog("please enter car name ");
					 brand = JOptionPane.showInputDialog("please enter car brand ");
					 model = JOptionPane.showInputDialog("please enter car model ");
					 String priceString = JOptionPane.showInputDialog("please enter car price ");
						price = Double.parseDouble(priceString);
					 bodyType = JOptionPane.showInputDialog("please enter body type  ");
					

					Car newcar = new NewCar( name, brand, model, price, bodyType,speed);
					cars [i]= newcar;
					break;
					
					
			case "2":
				 String kiloMeterString = JOptionPane.showInputDialog("please enter used car kilo meters ");
				int kiloMeter = Integer.parseInt(kiloMeterString);
					String year = JOptionPane.showInputDialog("please enter used car year  ");
					String owner = JOptionPane.showInputDialog("please enter used car owner  ");
					String ownerName = JOptionPane.showInputDialog("please enter used car owner name  ");
					String ownerNumber = JOptionPane.showInputDialog("please enter used car owner number  ");
				 name = JOptionPane.showInputDialog("please enter used car name ");
				 brand = JOptionPane.showInputDialog("please enter used car brand ");
				 model = JOptionPane.showInputDialog("please enter used car model ");
				  priceString = JOptionPane.showInputDialog("please enter used car price ");
					price = Double.parseDouble(priceString);
				 bodyType = JOptionPane.showInputDialog("please enter used car body type  ");
				

				Car usedCar = new UsedCar(kiloMeter, year, owner, ownerName, ownerNumber, name, brand, model, price, bodyType);
				cars [i]= usedCar;
					break;

				default:
					validProductSelection = false;
					productType =	JOptionPane.showInputDialog("please to add vegtables "
							+ "enter 1 \n to add electronics enter 2 \n to add clothes enter 3 \n");
					break;
				}
		
		 }
		 
			 userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new car  \n $ to sell car  "
					+ "\n # to view all product ");	
		 
		 validEntry = false ;
		break;
case "$":
	   
    String sellingPriceString = JOptionPane.showInputDialog("please enter a price ? ");
    double  sellingPrice = Double.parseDouble(sellingPriceString);
	
    for (int j = 0; j < cars.length; j++) {
		if (cars[j].getPrice() >= sellingPrice ){
			
			isPresent= true;
			priceAvailable=j;
		}
	}
	if (isPresent == true){
		JOptionPane.showMessageDialog(null, "available car price is"+priceAvailable );
	}else{
		JOptionPane.showMessageDialog(null, "sorry there is no car with the follow price:  "+priceAvailable);
	}
	
		
		break;
case "#":
	validEntry = true ;
	if (cars.length >0 ){
		for (int j = 0; j < cars.length; j++) {
			cars[j].printCarDetails();
		}
	}

	else{
		

		JOptionPane.showMessageDialog(null, "there are no products" );
	}

	break;

	default:
		validEntry = false;
		 userEntry = JOptionPane.showInputDialog( "please choose from below  \n  + to add new car  \n $ to sell car  "
					+ "\n # to view all product ");	

		break;
	}
		
	}		
}
	
}
