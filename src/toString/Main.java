package toString;

public class Main {

	public static void main(String[] args) {
		
		potpie potObject = new potpie(4, 20, 1994);
		tuna tunaObject = new tuna("Josh", potObject);
		
		System.out.println(tunaObject);
	}

}
