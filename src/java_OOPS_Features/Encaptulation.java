package java_OOPS_Features;

public class Encaptulation extends Encap_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encaptulation incap= new Encaptulation();
		incap.setNum1(12);
		incap.setNum2(44);
		
		int no_1= incap.getNum1();
		int no_2= incap.getNum2();
		
		System.out.println("no get is "+no_1+" and "+no_2);
	}

}
