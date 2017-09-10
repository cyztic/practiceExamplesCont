package multipleCons;

public class Main {

	public static void main(String[] args) {
		
		Cons object = new Cons();
		Cons object2 = new Cons(5);
		Cons object3 = new Cons(5,13);
		Cons object4 = new Cons(5, 13, 43);
		
		System.out.printf("%s\n", object.toMilitary());
		System.out.printf("%s\n", object2.toMilitary());
		System.out.printf("%s\n", object3.toMilitary());
		System.out.printf("%s\n", object4.toMilitary());
		
	}

}
