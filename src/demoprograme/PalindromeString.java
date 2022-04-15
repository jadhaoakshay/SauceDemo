package demoprograme;

public class PalindromeString {
	public static void main(String[] args) {
		String str="MADAM";
		String rev="";
		int len=str.length();
		System.out.println("The original String is"+ " "+str);
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is"+" "+rev);
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindome");
		}
	}

}
