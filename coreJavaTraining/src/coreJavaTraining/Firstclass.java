package coreJavaTraining;

public class Firstclass {
	
	static int a = 4;
	
	// Methods
	public void getData() {
		
		System.out.println("I am in method");
		//return "string";
		
	}
	
	// objects are the instances/references of a class
	
	
	public static void main(String[] args) {
		// create object of this class to access method  getData
		Firstclass fn = new Firstclass();
		fn.getData();
		System.out.println(fn.a);
		
		Secondclass sn = new Secondclass();
		sn.setData();
		
		//int b = 100;
		
		
		
		//System.out.println("Hello World!");
		//System.out.println(a);
		//System.out.println(b);
		
		
	}

}
