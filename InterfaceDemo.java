package OOps.inheritence;

//interface
interface Demoo
{
	//by default public static and final
int x=10;
void fun();
void rain();
}
interface Demo2
{
	int x= 200;
}
class Child implements Demoo,Demo2
{

	@Override
	public void fun() {
		System.out.println("Enjoying" + Demo2.x);
		
	}

	@Override
	public void rain() {
		System.out.println("It is raining");
		
	}
}
	class Sub implements Demoo
	{

		@Override
		public void fun() {
			System.out.println("Enjoying Sub");
			
		}

		@Override
		public void rain() {
			System.out.println("It is raining sub");
			
		}
	}
	

public class InterfaceDemo {

	public static void main(String[] args) {
	Child c1= new Child();
	c1.fun();
	c1.rain();
	//upcasting
	Demoo demo= new Sub();
demo.fun();
demo.rain();
	}

}

