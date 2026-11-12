public class CommercialUnit{

private int shopId;
private int shopNumber;
private double area;
private double rent;
private boolean isAvailable;

public CommercialUnit(int shopId,int shopNumber,double area,double rent,boolean isAvailable){

this.shopId=shopId;
this.shopNumber=shopNumber;
this.area=area;
this.rent=rent;
this.isAvailable=isAvailable;
}	
public int getshopId(){return shopId;}	
public void rentUnit(){

	if(isAvailable){

	System.out.println("Unit is rented.");
	isAvailable=false;
	}
	else{
	
	System.out.println("Unit is already rented");
	}

	}
public void releaseUnit(){

	if(!isAvailable){

	System.out.println("unit is released");
	isAvailable=true;
	
	}
	else{
	System.out.println("unit is already available");
	}

	}
public void displayUnitDetails(){

	System.out.println("Shop id: "+shopId+"\nShop Number: "+shopNumber+"\nArea: "+area+"\nRent: "+rent+"\nAvailability: "+isAvailable);
	
	
	}


	
	
}
