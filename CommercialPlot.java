public class CommercialPlot extends Plot{
	private BusinessType businessType;
	private String commercialCategory;



	public CommercialPlot(int plot,double area ,double price, String commercialCategory,BusinessType businessType){
		super(plot ,area , price);
		this.businessType=businessType;
		this.commercialCategory=commercialCategory;
		}
    public BusinessType getBusinessType() {
        return businessType;
    }
    public String getCommercialCategory() {
        return commercialCategory;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public void setCommercialCategory(String commercialCategory) {
        this.commercialCategory = commercialCategory;
    }
	public void registerBusiness(BusinessType businessType) {
    	this.businessType = businessType;
        System.out.println("Business registered successfully: " + businessType);
    }

    public String getCommercialDetails() {
        return "Commercial Plot\n" +
               "Plot Number: " + getPlotNumber() + "\n" +
               "Area: " + calculateArea() + " sq ft\n" +
               "Business Type: " + businessType + "\n" +
               "Commercial Category: " + commercialCategory;
    }

}
