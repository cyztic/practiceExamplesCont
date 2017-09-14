package staticexample;

public class Main {

	public static void main(String[] args) {
		
		StaticExample member1 = new StaticExample("Megan", "Fox");
		StaticExample member2 = new StaticExample("Natalie", "Portman");
		StaticExample member3 = new StaticExample("Taylor", "Swift");

		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(StaticExample.getMembers());
	}

}
