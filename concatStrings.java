package strings;

public class concatStrings {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd,def";
		String s2 = new String("abcd,efgh");
		
		System.out.println(s1.toUpperCase() + s2.toUpperCase());
		
		System.out.println(s2.length());
		
		String[] str1Array = s2.split(",");
		
		for(int i=0;i <str1Array.length;i++)
		{
			System.out.println(str1Array[i].toUpperCase());
		}
		

	}

}
