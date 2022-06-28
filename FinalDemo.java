package OOps.inheritence;

class  Demo
{
	final int num ;//define value at the time of initialization
    final static int n; 
	public Demo() {
	num=10;//blank final non static field can be initialized in constructor
	}

static
{
	 n = 30;//blank final field can be initialized in static block
}

final public void display()
{
	System.out.println("final method can't be override by any subclass");
}
}
class xyz extends Demo// you can't extend final class
{
	/*public void display()//can't override final method
	{
		
	}*/
}
public class FinalDemo {



	public static void main(String[] args) {
		FinalDemo demof= new FinalDemo();
		//demof.num=30;//
		//demof.num=30;// can't reinitialize final variable
		xyz x = new xyz();
		x.display();
	}

		
	}


