public class ResidentialPlot extends Plot{
    private int permittedFloors;
    private String constructionStatus;
    private boolean houseBuilt;
	
	public ResidentialPlot(int plot,double area ,double price,int permittedFloors){
		super(plot ,area , price);
		this.permittedFloors=permittedFloors;
		this.bedrooms=bedrooms;
        this.constructionStatus = "NOT_STARTED";
        this.houseBuilt = false;
	}
    public int getPermittedFloors() {
        return permittedFloors;
    }
    public String getConstructionStatus() {
        return constructionStatus;
    }
    public boolean isHouseBuilt() {
        return houseBuilt;
    }
    public void setPermittedFloors(int permittedFloors) {
        this.permittedFloors = permittedFloors;
    }
	public boolean setConstStatus(){
		constructionStatus=true;
		}
	public void displayResPlot(){
		System.out.println("Total floors: "+allowedFloors+"\nTotal Bedrooms :"+bedrooms);

	}






}
