package p1;

class A0 {
	String name = "Krish";
	int roll = 1;
	
	void show() {
		System.out.println("CLASS A");
	}
}

class B0 extends A0 {
	void see() {
		System.out.println("CLASS B");
	}
}

class C0 extends A0 {
	void display() {
		System.out.println("CLASS C");
	}
}

public class hire {
	public static void main(String[] args) {
		A0 var = new A0();
        var.show();

        B0 var1 = new B0();
        var1.show();
        var1.see();

        C0 var2 = new C0();
        var2.show();
        var2.display();
	}
}
