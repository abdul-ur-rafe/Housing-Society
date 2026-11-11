public class CommercialPlot extends Plot{
	private String businessType;
	private String commercialCategories;



	public CommercialPlot(int plot,double area ,double price, String commercialCategories,String businessType){
		super(plot ,area , price);
		this.businessType=businessType;
		this.commercialCategories=commercialCategories;
		}



    public String getCommercialDetails() {
        return "Commercial Plot\n" +
               "Plot Number: " + getPlotNumber() + "\n" +
               "Area: " + calculateArea() + " sq ft\n" +
               "Business Type: " + businessType + "\n" +
               "Commercial Category: " + commercialCategory;
    }

}
