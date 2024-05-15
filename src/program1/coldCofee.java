package program1;

public class coldCofee implements coffee,ice,milk,addsuger{

	public static void main(String[] args) {
	
coldCofee c=new coldCofee();
c.addmilk();
c.addice();
c.suger();
c.addcoffee();

	}
	public void addmilk() {
		System.out.println("this is milk");
	}
public void addice() {
	System.out.println("this is ice");
}
public void suger() {
	System.out.println("this is suger");
}
public void addcoffee() {
	System.out.println("this is coffee");

}



}