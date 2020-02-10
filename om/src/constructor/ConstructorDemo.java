package constructor;

public class ConstructorDemo {
	
	private ConstructorDemo(){
		
		System.out.println("default Constructor");		
	}
	
	ConstructorDemo(int a){
		System.out.println("Constructor :"+a);
	}

	public static void main(String[]args) {
		ConstructorDemo constructorDemo=new ConstructorDemo();
	}
	
}
