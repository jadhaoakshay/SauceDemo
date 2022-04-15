package OOPsConcept;

public class ChildClass extends ParentClass
{
	public void m2()
	{
		System.out.println("ChildClass");
	}
	public static void main(String[] args) {
	ParentClass x=new ChildClass();
	
	x.m1();

	}

}
