public class Hello {
	public static void main(String[] args) {
		if(args.length > 0) 
			System.out.println("Welcome " + args[0] + " to the World");
		else
			System.out.println("Welcome everybody to the World");
	}
}