public class CommercialPlot extends Plot{
    private String businessType;
    private String commercialCategory;



	public CommercialPlot(int plot,double area ,double price, String commercialCategory,String businessType){
		super(plot ,area , price);
		this.businessType=businessType;
		this.commercialCategory=commercialCategory;
		}
    public String getBusinessType() {
        return businessType;
    }
    public String getCommercialCategory() {
        return commercialCategory;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setCommercialCategory(String commercialCategory) {
        this.commercialCategory = commercialCategory;
    }
    public void registerBusiness(String businessType) {
        setBusinessType(businessType);
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
