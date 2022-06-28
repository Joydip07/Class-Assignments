package OOps.inheritence;

class Company
{
	private int companyId;
	private String employeeName;
	Location location; // entity reference-aggregation
	//constructor
	public Company(int companyId, String employeeName, Location location) {
		super();
		this.companyId = companyId;
		this.employeeName = employeeName;
		this.location = location;
	}

	public void display()
	{
System.out.println("Comapany Id: "+this.companyId+ " "+ "Company Name : "+ this.employeeName);
System.out.println("City : "+location.city+ " " +"Country :"+ location.city+ " "+ "State :"+ location.state+
		" "+"Pincode: "+ location.pincode);		
	}
}// end of company class

public class AggregationDemo {
	 
	public static void main(String[]args)
	{
		Location location1= new Location ("Kolkata", "India", "WestBengal", "700086");
		Location location2=new Location("Bangalore", "India", "Karnataka", "700032");
		
		Company capgemini = new Company(384, "Capgemini", location2);
		Company cognizant = new Company(386, "Cognizant", location1);
		capgemini.display();
		cognizant.display();
	}

}
