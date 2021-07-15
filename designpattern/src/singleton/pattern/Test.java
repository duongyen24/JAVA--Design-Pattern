package singleton.pattern;

public class Test {

	public static void main(String[] args) {
		/* learn how to write code, design class
		Singleton pattern: only have 1 object in 1 class
		
		steps:
		1. set constructor private
		2. create getInstance method

*/		
		Logger obj1 = Logger.getInstance() ;
		Logger obj2 = Logger.getInstance() ;
		System.out.println(obj1.hashCode()); //sme address 
		System.out.println(obj2.hashCode());
	} 

}
