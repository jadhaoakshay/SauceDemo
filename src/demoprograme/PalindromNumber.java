package demoprograme;

public class PalindromNumber 
{
	public static void main(String[] args)
	{
		int num = 45654;
		int org_num=num;
		System.out.println("Original Number is" + " " + num);

		int rev = 0;
		while (num != 0) 
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is" + " " + rev);

		if (org_num == rev)
		{
			System.out.println("number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}

	}

}
