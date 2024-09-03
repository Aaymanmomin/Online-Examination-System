package First;
//method variable cons when object creation call
//all things are gone into heap memory

public class SecondClass{
	
	
	//cons call use this
//SecondClass() //1st cons{
//	this();//recursive mean 1st cons call then 2nd cons call called recursive
//		
	//}
	
	
	public SecondClass() {
		this(234);
	
	}
	

	public SecondClass(int w) {
		
	
	}
	int p=90;//call var use this
	
	
 
	void m1() {
		System.out.println("m1");
		System.out.println(this.p);//this nhi likhe to jvm likhta hai
//		SecondClass s=new SecondClass();//object creation
//		s.m2();
		
		this.m2(); // call method
	}
	
	void m2() {
		System.out.println("m2");
	}
	
	
	
	public static void main(String[] args) {
		SecondClass s=new SecondClass();//object creation
		s.m1();
	}
	
//this is keyword in java exactly replacement in line 
	//to sve memory by use this key
	//call cons var method.
// call cons only 1st line pr 
	//recursive call not allow
	
	//object create krk call global var
	
}
