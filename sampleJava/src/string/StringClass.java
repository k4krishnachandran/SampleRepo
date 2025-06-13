package string;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello World";
		
		//Method 1-to find  length of the string
		System.out.println(s1.length());
		
		//Method 2-charAt to get character based on index
		System.out.println(s1.charAt(1));
		
		
		//Method 3-valueOf convert 
		int a=123;
		String a1=String.valueOf(a); ///converts an integer value to String
		System.out.println(a1);
		
		String s3="123";
		int s4=Integer.valueOf(s3);
		System.out.println(s4);
		
		//Method 4-equals()
		String s5="java";
		System.out.println(s1.equals(s5));
		
		
		//Method 5-equalsIgnoreCase()
		String s6="hello World";
		System.out.println(s1.equalsIgnoreCase(s6));
		
		//Method 6-isEmpty()
		System.out.println(s6.isEmpty());
		
		// Method 7- concate()
		System.out.println(s3.concat(s6));
		
		//Method 8-toLowerCase()
		System.out.println(s1.toLowerCase());
		
		//Method 9-toUpperCase()
		System.out.println(s6.toUpperCase());
		
		//Method 10-contains()
		System.out.println(s1.contains("world"));
		
	}

}
