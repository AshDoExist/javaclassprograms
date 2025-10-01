package p1;

class A {
	String name="Krish";
	int rollno = 1;
	
	void show() {
		System.out.println("Parent Class");
	}
}

class B extends A {
	void display() {
		System.out.println("Child Class");
	}
}

class C extends B {
	void add() {
		System.out.println("Class C method");
	}
}

public class inherit {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.name);
		System.out.println(b.rollno);
		b.show();
		b.display();
		C c = new C();
		c.add();
		c.show();
		c.display();
	}
}
