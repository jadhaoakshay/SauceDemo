package StringPrograme;

public class StringBulder {
	public static void main(String[] args) {
		
		//StringBuffer
		
		StringBuffer buffer=new StringBuffer("India is my"+" ");
		buffer.append("Country");
		System.out.println(buffer);
		
		// StringBuilder
		
		StringBuilder builder=new StringBuilder("I love my"+" ");
		builder.append("Country");
		System.out.println(builder);
	}

}
