public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}
	
	public static void main (String args[]) {
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println(single1);
		System.out.println(single2);
	}
}