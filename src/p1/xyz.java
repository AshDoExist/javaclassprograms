package p1;

class Parent {
	public int age = 50;
	protected String name = "Amit";
	private String secret = "xyz";
	
	public void display() {
		System.out.println("Parent display");
	}
	
	private void hidden() {
		System.out.println("Parent hidden method");
	}
	
	public static void staticMethod() {
		System.out.println("Static method of Parent");
	}
	
	final void finalMethod() {
		System.out.println("Final method of parent");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("Name: " + name);
		//System.out.println(secret);
	}
	
	@Override
	public void display() {
		System.out.println("child display");
	}
}

public class xyz {
	public static void main(String[] args) {
        Parent p = new Parent();
        p.display();              // Parent display
        Parent.staticMethod();    // Static method of Parent
        
        Child c = new Child();
        c.display();              // Child display (overridden)
        c.show();                 // Name: Amit
        Child.staticMethod();     // Static method of Child
        
        // Upcasting
        Parent ref = new Child();
        ref.display();            // Child display (runtime polymorphism)
        ref.staticMethod();       // Static method of Parent (static binding)
    }

}
