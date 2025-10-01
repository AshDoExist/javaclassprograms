package polymorphism;

class payment {
	void pay() {
		System.out.println("Payment is processing");
	}
}

class CreditC extends payment {
	void pay() {
		System.out.println("Payment done thru CC");
	}
}

class upi extends payment {
	void pay() {
		System.out.println("Payment done thru UPI");
	}
}

class netB extends payment {
	void pay() {
		System.out.println("Payment done thru Net Banking");
	}
}

public class runtime {
	public static void main (String[] args) {
		
	}
}
