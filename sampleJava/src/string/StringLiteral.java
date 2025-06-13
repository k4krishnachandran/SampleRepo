package string;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Reshma";
String s2="Reshma";
String s3="reshma";
String s4=new String("Java");
String s5=new String("Java");
System.out.println(s1.equals(s2)); //true(compares the values in s1 and s2)
System.out.println(s1.equals(s3)); //false(compares the values in s1 and s3)
System.out.println(s4.equals(s5)); // 

System.out.println(s1==s2);// values are equal and s2 is not created in memory(compares the variable s1 and s2)
System.out.println(s4==s5);
		
	}

}
