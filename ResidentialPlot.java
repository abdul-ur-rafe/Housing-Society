public class ResidentialPlot extends Plot{
	private int allowedFloors;
	private boolean constructionStatus;
	private int bedrooms;
	
	public ResidentialPlot(int plot,double area ,double price,int allowedFloors,int bedrooms){
		super(plot ,area , price);
		this.allowedFloors=allowedFloors;
		this.bedrooms=bedrooms;
		constructionStatus=false;

	}
	public boolean setConstStatus(){
		constructionStatus=true;

		}
	public void displayResPlot(){
		System.out.println("Total floors: "+allowedFloors+"\nTotal Bedrooms :"+bedrooms);

	}






}