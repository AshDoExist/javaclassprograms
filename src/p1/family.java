package p1;

class parent {
	String add = "256 Bit Road";
	String surname = "Chaudhary";
	String Vehicle = "Tata Nexon";
	
	void display() {
		System.out.println("Parent class");
	}
}

class child1 extends parent{
	void show() {
		System.out.println("child 1");
	}
}

class child2 extends parent{
	void see() {
		System.out.println("child 2");
	}
}

class grand_child1 extends child1{
	void view() {
		System.out.println("grandchild 1");
	}
}

public class family {
	public static void main () {
		
	}
}
