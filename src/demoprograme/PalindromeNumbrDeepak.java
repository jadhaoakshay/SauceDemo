package demoprograme;

public class PalindromeNumbrDeepak {

	public static void main(String[] args) {
		int num=45657;
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;//0*10+1,0+1=1,10+2,12,12+1%10,121
			num=num/10;//121/10,12,1
		}
	     System.out.println(rev);
	     if(org_num==rev)
	    	 
	     {
	    	 System.out.println("Number is plaindrome");
	     }
	     else
	     {
	    System.out.println("number is not palindrome");
	     }
	

	}

}
