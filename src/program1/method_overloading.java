package program1;

public class method_overloading {
public void Fan(int a,int b) {
	System.out.println(a*b);
}
public void Fan(int c, double D,int a) {
	System.out.println(c*D*a);
	}
public static void main2(String [] args) {
	method_overloading t=new method_overloading();
	t.Fan(10,45);
}
	public void Fan(int D,int c,int a) {
		System.out.println(D*c*a);
	}
	public static void main1(String []args) {
		method_overloading s=new method_overloading();
		s.Fan(10,11 );
}
	public static void main(String [] args) {
		method_overloading t=new method_overloading();
		t.Fan(12,1);
	}
}
