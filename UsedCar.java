
public class UsedCar extends Car {

	private double kilometers;
	private String year;
	private String owner;
	private String ownerName;
	private String ownerNumber;
	
	
	
	
	public UsedCar(double kilometers, String year, String owner, String ownerName, String ownerNumber) {
		super();
		this.kilometers = kilometers;
		this.year = year;
		this.owner = owner;
		this.ownerName = ownerName;
		this.ownerNumber = ownerNumber;
	}




	public UsedCar(int kiloMeter, String year2, String owner2, String ownerName2, String ownerNumber2, String name,
			String brand, String model, Double price, String bodyType) {
		
	}




	public double getKilometers() {
		return kilometers;
	}




	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}




	public String getYear() {
		return year;
	}




	public void setYear(String year) {
		this.year = year;
	}




	public String getOwner() {
		return owner;
	}




	public void setOwner(String owner) {
		this.owner = owner;
	}




	public String getOwnerName() {
		return ownerName;
	}




	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}




	public String getOwnerNumber() {
		return ownerNumber;
	}




	public void setOwnerNumber(String ownerNumber) {
		this.ownerNumber = ownerNumber;
	}




	@Override
	void printCarDetails() {
		System.out.println ("car name"+name +"\ncar brand "+brand+"\ncar model"+model+"\ncar price"+price +
				"\ncar body type"+bodyType+	"\nkilo meters: "+kilometers+"\nyear"+year+"\ncar owner "+owner +
				"\nowner name"+ownerName +"\nowner number"+ownerNumber	);	
		
	}

}
