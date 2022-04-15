package demoprograme;

public class ReverseString 
{

	public static void main(String[] args)
	{
		String str="Akshay";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Original String is"+ " "+str);
		System.out.println("Reverse string is"+" "+rev);

	}
	
}