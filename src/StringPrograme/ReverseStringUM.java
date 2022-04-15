package StringPrograme;

public class ReverseStringUM {
	public static void main(String[] args) {
		String str="Welcome to java";
		String rev="";
        String org_str=str;
		int len=str.length();
		System.out.println("1)"+"The original string is"+"-"+" "+str);
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("2)"+"Reverse string is" +"-"+" "+rev);
		if(org_str.equals(rev))
		{
			System.out.println("3)"+"String is palindrome");
		}
		else
		{
			System.out.println("4)"+"String is not palindrome");
		}
		int removechar=str.replace("e","").length();
		int total=len-removechar;
		System.out.println("5)"+total);
		
		
	}
	

}
