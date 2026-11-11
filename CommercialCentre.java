public class CommercialCentre extends Plot{

	private int centreId;
	private String centreName;
	private String description;
	private int totalFloors;

	public CommercialCentre(int plotNumber, int plotId, double area, double price, String centreName , String location , int totalFloors){
			super(plotNumber, area, price);
			this.centreName = centreName;
			this.location = location;
			this.totalFloors = totalFloors;
		
	}
	
	public void displayPlotDetails(){
		

	}

	public double calculatePrice(){
		

	}

	public void updateAvailablity(){
		

	}
	




}
