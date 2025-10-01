package abstraction;

abstract class vehicle {
	abstract void start();
	abstract void brake();
}

class car extends vehicle {
	void start() {
		System.out.println("Car starting");
	}
	void brake() {
		System.out.println("Car braking");
	}
}

class bike extends vehicle {
	void start() {
		System.out.println("Bike starting");
	}
	void brake() {
		System.out.println("Bike braking");
	}
}

public class classroom {
	public static void main(String[] args) {
		vehicle v1 = new car();
		vehicle v2 = new bike();
		v1.start();
		v2.start();
		v1.brake();
		v2.brake();
		
	}
}
