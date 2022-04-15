package demoprograme;

public class ReverseNumberWithoutArray {
	public static void main(String[] args) {
		int num=1234;
		System.out.println("original number is"+" "+num);
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("rev number is"+" "+rev);
		
		
		
	}

}
