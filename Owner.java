public class Owner{

	private int ownerId;
	private String cnic;
	private String phone;
	private String address;
	private String name;

	public Owner(int ownerId,String cnic,String phone,String address,String name){
		
	this.ownerId=ownerId;
	this.cnic=cnic;
	this.phone=phone;
	this.address=address;	
	this.name=name;	
		
	}
	
	public void payMaintenance(){

	System.out.println("Maintenance paid successfully");
	
	}

	public void displayDetails(){

	System.out.println("Owner Id: "+ownerId+"\nCnic: "+cnic+"\nPhone number: "+phone+"\nAddress: "+address+"\nName: "+name);
	
	}
	

	
	}
