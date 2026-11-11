public class Block extends HousingSociety{

private String blockName;
private int blockNumber;

public Block(String societyName, String location, String blockName, int blockNumber){
	super(societyName, location);
	
	this.blockName = blockName;
	this.blockNumber = blockNumber;

}

public void addPlot(Plot plot){
	for(int i =0; i<= plot.length; i++)
		if (plot[i]==null){
		plot[i]= plot;


}


public void removeBlock(Plot plot){

for(int i =0; i<=plot.length; i++)
		if (plot[i]==plot){
		plot[i]= null;
}

}


public void displayBlockDetails(){
super.displaySocietyDetails();
for(int i =0; i<= plot.length; i++)
	System.out.println(plot[i]);


}





}