public class CommercialCentre extends Plot{

	private int centreId;
	private String centreName;
	private String description;
	private int totalFloors;
	private CommercialUnit shops [] = new CommercialUnit [20];
	private int count;

	public CommercialCentre(int plotNumber, int plotId, double area, double price, Plotshape shape, Owner owner, PlotStatus status, int centreId, String centreName , String description , int totalFloors){
			super(plotNumber, plotId, area, price, shape, owner, status);
			this.centreName = centreName;
			this.centreId = centreId;		
			this.description = description;
			this.totalFloors = totalFloors;
		
	}
	
	public void addShop(CommercialUnit shop){
		if(count>= shops.length) {}
		else{shops[count++] = shop;}
	}

	public void removeShop(int shopId){
		for(int i=0 ; i<count ; i++){
				if(shops[i].shopId == shopId){
					shop[i] = null;	
				}
		}
	}

	public void displayCentreDetails(){
		super().getPlotDetails();
		System.out.println("Centre ID: " + centreId);
		System.out.println("Centre Name: " + centreName);
		System.out.println("Total FLoors: " + totalFloors);
		System.out.println("Description: " + description);
	}
	




}
