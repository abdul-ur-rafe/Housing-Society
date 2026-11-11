public class CommercialPlot extends Plot{
	private String businessType;
	private String commercialCategories;



	public CommercialPlot(int plot,double area ,double price, String commercialCategories,String businessType){
		super(plot ,area , price);
		this.businessType=businessType;
		this.commercialCategories=commercialCategories;
		}


	public void displayCommDet(){
		System.out.println("BusinessType: "+businessType+"\nCommercial Categories: "+commercialCategories);


		}


}