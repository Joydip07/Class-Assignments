package OOps.inheritence;

// super class
abstract class Bank 
{
	public abstract void getloaninterest();
}//end of bank class

// child 1
class SBI extends Bank
{
public void CreateAccount()
{
	System.out.println("Account Created");
}

@Override
public void getloaninterest() {
	
	
}
}// end of sbi class

//child 2
class HDFC extends Bank
{

	@Override
	public void getloaninterest() {
	System.out.println("8% interest rate");
		
	}
	//owns features
}
// child 3

class Axis extends Bank
{

	@Override
	public void getloaninterest() {
		System.out.println("12% interest rate");
		
	}
	//owns features
}

public class HierarchyInheeitenceDemo {

	public static void main(String[] args) {
	Axis axis = new Axis ();	
    axis.getloaninterest();
    HDFC hdfc = new HDFC();
    hdfc.getloaninterest();
    SBI sbi = new SBI ();
    sbi.getloaninterest();
    sbi.CreateAccount();
	}

}
