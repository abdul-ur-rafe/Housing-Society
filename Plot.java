public abstract class Plot{

	private int plotNumber;
	private double area;
	private double price;
	private boolean isAvailable;

	public Plot(int plotNumber, double area, double price){
		this.plotNumber = plotNumber;
		this.area = area;
		this.price = price;
		isAvailable = false;
	}
	
	public void displayPlotDetails(){
		System.out.println("Plot Number: " + plotNumber);
		System.out.println("Area: " + area);
		System.out.println("Price: " + price);
		System.out.println("Availability: " + isAvailable);
	}

	public void updateAvailablity(){
		if(isAvailable == false) {isAvailable = true;}
		else {isAvailable = false;}
	}
	




}
