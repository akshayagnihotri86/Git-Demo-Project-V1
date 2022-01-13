package test;



public class Addition {
	int a;
	int b;
	int c;
	
	int Method1(int a, int b)
	{
		int c = a + b ;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		System.out.println("The addition of two number is" +a.Method1(20,30));
	}
}
