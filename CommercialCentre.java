public class CommercialCentre extends Plot{

	private int centreId;
	private String centreName;
	private String description;
	private int totalFloors;

	public CommercialCentre(int plotNumber, int plotId, double area, double price, Plotshape shape, Owner owner, PlotStatus status, int centreId, String centreName , String description , int totalFloors){
			super(plotNumber, plotId, area, price, shape, owner, status);
			this.centreName = centreName;
			this.centreId = centreId;		
			this.description = description;
			this.totalFloors = totalFloors;
		
	}
	
	public void addShop(CommercialUnit shop){
		

	}

	public void removeShop(int shopId){
		

	}

	public void displayCentreDetails(){
		super().getPlotDetails();
		System.out.println("Centre ID: " + centreId);
		System.out.println("Centre Name: " + centreName);
		System.out.println("Total FLoors: " + totalFloors);
		System.out.println("Description: " + description);
	}
	




}
