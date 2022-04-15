package demoprograme;

public class NumberofWordInString {

	public static void main(String[] args) {
		String str="First java program by Akshay";
		int len=str.length();
		System.out.println(len);
		System.out.println(str.split("\\s+").length);
		
		

	}

}
