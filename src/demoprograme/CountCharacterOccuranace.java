package demoprograme;

public class CountCharacterOccuranace 
{

	public static void main(String[] args)
	{
		String str = "INDIA IS MY COUNTRY";
		String rev = "";
		int totallen = str.length();
		for (int i = totallen - 1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		int After_removalI = str.replace("I", "").length();
		int total = totallen - After_removalI;
		System.out.println(total);
	}

}
