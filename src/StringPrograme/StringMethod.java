package StringPrograme;

public class StringMethod {
	public static void main(String[] args) {
		String str="India";
   
		String a =" Is my country";
		int len=str.length();
		System.out.println(len);
		System.out.println(str.charAt(2));
		System.out.println(str.concat(a));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(a));
		System.out.println(str.equalsIgnoreCase(a));
		System.out.println(str.startsWith("In"));
		System.out.println(str.endsWith("ry"));
		System.out.println(a.trim());
		System.out.println(str.substring(2));
		System.out.println(str.substring(0,5));
		
	}

}
