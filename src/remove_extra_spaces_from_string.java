
public class remove_extra_spaces_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ram    is   good";
		
		String x = s.trim().replaceAll("\s+" , " " );
		
		System.out.println(x);

	}

}
