package fileHandling;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("Welcome to UST");
		
		System.out.println(str);
		
		str.append("Global");
		
		System.out.println(str);
		
		str.insert(8, " Hyderaba ");
		System.out.println(str);
		
		str.replace(7,20, "Hyderabad");
		System.out.println(str);
		
		
		

	}

}
