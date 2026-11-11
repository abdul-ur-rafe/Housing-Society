public class HousingSociety{
	private int societyId;
	private String societyName;
	private String location;
	private double totalArea;
	private Block blocks [];
	private int count;

public HousingSociety(int societyId, String societyName, String location , double totalArea){
	this.societyId = societyId;
	this.societyName = societyame;
	this.location = location;
	this.totalArea = totalArea;
}

public void addBlock(Block block){
		blocks[count++] = block;
}

public void removeBlock(Block block){
	for(int i =0; i<=count; i++)
		if (block[i]==block){
		block[i]= null;
}

}

public void displaySocietyDetails(){
	System.out.println("Society Id: " + societyId);
	System.out.println("Society Name: " + societyName);
	System.out.println("Location: " + location);
	System.out.println("Total Area: " + totalArea);

}







}
