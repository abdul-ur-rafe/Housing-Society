public class Block{

private String blockId;
private String blockName;
private int blockNumber;	
private Plot plots[];
private int count;
	
public Block(String blockId, String blockName, int blockNumber){
	this.blockId = blockId;
	this.blockName = blockName;
	this.blockNumber = blockNumber;

}

public void addPlot(Plot plot){
	plots[count++] = plot;
}


public void removePLot(Plot plot){
	for(int i =0; i<count; i++)
		if (plots[i]==plot){
			plots[i]= null;
	}

}

public Plot searchPlot(int number){
	return plots[number];
}	

public void displaySocietyDetails(){
	System.out.println("Block Id: " + blockId);
	System.out.println("Block Name: " + blockName);
	System.out.println("Block Number: " + blockNumber);
}


public String getBlockName(){return blockName;}


}
