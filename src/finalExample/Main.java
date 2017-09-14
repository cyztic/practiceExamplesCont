package finalExample;

public class Main {

	public static void main(String[] args) {
		
		FinalExample object = new FinalExample(10);
		for(int i = 0; i<5;i++){
			object.add();
			System.out.printf("%s",object);
		}

	}

}
