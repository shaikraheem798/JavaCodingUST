package coding;

public class Car {
	
	private String colour;
	private int height;
	
	public Car(String c, int h) {
		
		this.colour = c;
		this.height = h;
	}
	
	public Car() {
		
		this.colour = "green";
		this.height = 50;
	
	}
	
	public boolean start()
	{
		System.out.println("started");
		return true;
	}
	
	public boolean stop()
	{
		System.out.println("stopped");
		return true;
	}

}
