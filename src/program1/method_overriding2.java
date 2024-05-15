package program1;

public class method_overriding2 extends method_overriding {
public void car(int a,int b) {
	System.out.println(a*b+"this is the second most program of mine");
}
public static void main(String [] args) {
	method_overriding s=new method_overriding();
	s.car(12,12);
	method_overriding2 t=new method_overriding2();
	t.car(23,34);
}
}
