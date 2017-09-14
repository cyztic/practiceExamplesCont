package finalExample;

public class FinalExample {

	private int sum;
	private final int NUMBER;
	
	public FinalExample(int x){
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n",  sum);
	}

}
