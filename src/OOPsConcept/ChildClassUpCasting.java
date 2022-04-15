package OOPsConcept;

public class ChildClassUpCasting extends ParentClass

{
	public void method3()
	{
		System.out.println("ChildClass-method3");
	}
	
	public void method4()
	{
		System.out.println("ChildClass-method4");
	}
	
	public static void main(String[] args) 
	{
		ParentClassUpCasting g=new ParentClassUpCasting();
		g.method1();
		g.method2();
		
		
	}
	}




