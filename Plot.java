public abstract class Plot{

	private int plotNumber;
	private int plotId;
	private double area;
	private double price;
	private PlotStatus status;
	private PlotShape shape;
	private Owner owner;

	public Plot(int plotNumber, int plotId, double area, double price, PlotShape shape, Owner owner, PlotStatus status){
		this.plotNumber = plotNumber;
		this.plotId = plotId;
		this.area = area;
		this.price = price;
		this.shape = shape;
		this.owner = owner;
		this.status = status;
	}
	
	public void getPlotDetails(){
		System.out.println("Plot ID: " + plotId);
		System.out.println("Plot Number: " + plotNumber);
		System.out.println("Area: " + area);
		System.out.println("Price: " + price);
		System.out.println("Shape: " + shape);
		System.out.println("Status: " + status);
		System.out.println("Owner: " + owner);
	}

	public double calculateArea(){
			return area;
	}

	public void updateStatus(PlotStatus status){
		this.status = status;
	}

	public int getPlotNumber(){
		return plotNumber;
	}
	




}
