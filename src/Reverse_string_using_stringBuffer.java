
public class Reverse_string_using_stringBuffer {

	public static void main(String[] args) 
	{
		String s = "abcde";
		
//		StringBuffer sb = new StringBuffer(s);
//		
//		StringBuffer rev = sb.reverse();
//		
//		String x = rev.toString();
//		
//		System.out.println(x);
		
		
//		same in one line
		
		System.out.println(new StringBuffer(s).reverse().toString());

	}

}
