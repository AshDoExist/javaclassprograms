package classroom;

class s {
	private String name;
    private int rollno;
    private int marks;
    
    s(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    
    public int getmarks() {
    	return marks;
    }
    
    void read() {
        System.out.println("Reading");
    }

    public void setmarks(int marks) {
    	if (marks >= 0 && marks <= 100) {
    		this.marks = marks;
    		System.out.println("Updated !");
    	}
    	else {
    		System.out.println("Invalid");
    	}
    }
}

public class student {
    public static void main(String[] args) {
        s s1 = new s("Krish", 138);
        s1.read();
    }
}