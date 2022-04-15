package OOPsConcept;

public class ImplementationClass implements Interface2,Interface1
{
	@Override
	public void m1() {
		int a=10;
		String s="Akshay";
		System.out.println(a+" "+s);

	}

	@Override
	public void m2() {
	
		int x=20;
	
	
		String s1="Abhijeet";
		System.out.println(x+" "+s1);
	}

	@Override
	public void m3() {
		int z=30;
	
		String s2="Ashita";
		System.out.println(z+" "+s2);
	}
    public static void main(String[] args) {
    	ImplementationClass imp=new ImplementationClass();
    	imp.m1();
    	imp.m2();
    	imp.m3();
	}

}
