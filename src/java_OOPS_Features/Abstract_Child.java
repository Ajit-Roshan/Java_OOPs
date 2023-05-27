package java_OOPS_Features;

public class Abstract_Child extends Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Child abs= new Abstract_Child();
		abs.one();
		abs.two();
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("abstract one");		
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("abstract one");	
	}

}
