package toString;

public class potpie {

	private int month;
	private int day;
	private int year;
	
	public potpie(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this); //this will call to the toString method 
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
		
	}
}
