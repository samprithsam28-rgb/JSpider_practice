
public class find_num_of_consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde@123dcfgvhbjnkl";
		
		int vc=0, cc=0;
		
		for(int i= 0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
					vc++;
				else
					cc++;
				
			}
		}
		System.out.println("no of vowels:" + vc);
		System.out.println("no of consonants:" + cc);

	}

}
