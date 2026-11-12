public class ResidentialPlot extends Plot{
	private int permittedFloors;
	private ConstructionStatus constructionStatus;
	private boolean houseBuilt;
	public ResidentialPlot(int plotNumber, int plotId, double area,double price, PlotShape shape, Owner owner, PlotStatus status,int permittedFloors) {
		super(plotNumber, plotId, area, price, shape, owner, status);
		this.permittedFloors=permittedFloors;
		this.constructionStatus = ConstructionStatus.NOT_STARTED;
        this.houseBuilt = false;
	}
	public int getPermittedFloors() { return permittedFloors; }
	
	public  ConstructionStatus getConstructionStatus() { return constructionStatus; }
	public boolean isHouseBuilt() { return houseBuilt;}
	
	public void setPermittedFloors(int permittedFloors) {
	this.permittedFloors = permittedFloors;
	}
	public void updateConstructionStatus(ConstructionStatus status) {
    	this.constructionStatus = status;
		 this.houseBuilt = (status == ConstructionStatus.COMPLETED);
	}
	
	public String getResidentialDetails() {
		return "Residential Plot\n" +"Plot Number: " + getPlotNumber() + "\n" +"Area: " + calculateArea() + " sq ft\n" +"Permitted Floors: " + permittedFloors + "\n" +"Construction Status: " + constructionStatus + "\n" +"House Built: " + houseBuilt;
    }







}
