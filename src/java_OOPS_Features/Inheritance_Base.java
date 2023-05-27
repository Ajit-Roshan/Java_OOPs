package java_OOPS_Features;

import java_OOPS_Features.Inheritance_Interface.OneInterface;

//public class Inheritance_Base implements OneInterface extends Inherit_Child{
public class Inheritance_Base extends Inherit_Child implements OneInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Inheritance_Base inherit= new Inheritance_Base();
		int res= inherit.add(10, 22);
		System.out.println("add ans is :: "+ res);
		
		int res1= inherit.multi(12, 10);
		System.out.println("multi ans is :: "+res1);
		
		int res2= inherit.div(100, 5);
	
		System.out.println("div ans is :: "+res2 );
		Inheritance_Base ib=new Inheritance_Base();
		ib.ione();
		ib.itwo();	
	}
	@Override
	public void ione() {
		// TODO Auto-generated method stub
		System.out.println("interface ione");
	}

	@Override
	public void itwo() {
		// TODO Auto-generated method stub
		System.out.println("interface itwo");
	}
}
