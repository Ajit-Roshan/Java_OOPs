package java_OOPS_Features;

public class Polymorphism {

	static void One() {
		System.out.println("this is one");
	}
	
	static void One(String name) {
		System.out.println("hello "+name+" sir");
	}
	
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One();
		One("varun");
		
	}

}
