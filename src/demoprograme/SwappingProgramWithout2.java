package demoprograme;

public class SwappingProgramWithout2 {
	public static void main(String[] args) {
		int a=20;
		int b=30;
//		int  c;
		System.out.println("the original number"+a+" "+b);
//	With using third veriable
//        c=a;
//		a=b;
//		b=c;
// Without using third veriable
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		with using / and *
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("number after swapping"+a+" "+b);
		
		
		
	}

}
