import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


	public class HousingSociety{
		private int societyId;
		private String societyName;
		private String location;
		private double totalArea;
		private LocalDate establishmentDate;
		private final List<Block> blocks;

	public HousingSociety(int societyId, String societyName, String location , double totalArea,LocalDate establishmentDate){
	this.societyId = societyId;
	this.societyName = Objects.requireNonNull(societyName, "Society Name cannot be null");
	this.location = Objects.requireNonNull(location, "Location cannot be null");
	this.totalArea = totalArea;
	this.establishmentDate = Objects.requireNonNull(establishmentDate, "Establishment date cannot be null");
	this.blocks = new ArrayList<>();
}

	public void addBlock(Block block){
		if (block == null){
			throw new IllegalArgumentException("Added block Cannot be Null");
			}
		if (!blocks.contains(block)){
				blocks.add(block);
		}

	}

	public void removeBlock(Block block){
		blocks.remove(block);
	}

	public Block findBlock(String name){
		if(name == null || name.isBlank()){
		return null;
	}
		for(Block block : blocks){
			if(block.getBlockName()==name){
				return block;
			}
			
		}
		return null;
	
	}

	


	public void displaySocietyDetails(){
		System.out.println("   Housing Society  ");
		System.out.println("ID: "+ societyId + " | Name: "+ societyName);
		System.out.println("Location: "+ location + " | Total Area: "+ totalArea);
    		System.out.println("Established: "+ establishmentDate + " | Total Blocks: "+ blocks.size());
		for (Block block : blocks){
			block.displaySocietyDetails();
	}
}

	public int getsocietyId(){ 
		return societyId; 
}
	public String getSocietyName(){
		return societyName;
}
	public String getLocation(){
		return location;
}
	public double getTotalArea() {
		return totalArea;
}
	public LocalDate getEstablishmentDate(){
	 	return establishmentDate;
}
	public List<Block> getBlocks(){
		return blocks;
}
}
