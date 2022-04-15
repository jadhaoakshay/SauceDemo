package demoprograme;

public class PalindromeStringDeepak
{

	public static void main(String[] args)
	{
		String str = "Indian PARA SF";
		String rev = "";
		int len = str.length();
		System.out.println("The original String is" + " " + str);
		for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse String is" + " " + rev);
		if (str.equals(rev))
		{
			System.out.println("It is palindrome string");
		} else 
		{
			System.out.println("It is not a palindrome string");
		}
	}

}
