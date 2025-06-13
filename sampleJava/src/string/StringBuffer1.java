package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer=new StringBuffer("hello");
		System.out.println(buffer);

		//Method 1- append()
		System.out.println(buffer.append("world"));
		
		//Method 2-insert()
		System.out.println(buffer.insert(5, 'o'));
		
		//Method 3-replace()
		System.out.println(buffer.replace(6, 7, "v"));
		
		//Method 4-delete()
		System.out.println(buffer.delete(4, 7));
		
		//Method 5-reverse()
		//System.out.println(buffer.reverse());
		
		//Method 6-capacity()
		StringBuffer buffer1=new StringBuffer("");
		System.out.println(buffer1.capacity());
		System.out.println(buffer.capacity());
		
		//Method 7-substring()
		System.out.println(buffer.substring(3));
		
	}

}
