public class Main 
{
	// this is a created method
	static void PrintLinebreak() 
	{
		System.out.print("\n");
	}

	public static void main(String[] args)
	{
		// Print out a basic line that says "Hello World"
		System.out.println("Hello World");

		/*
		I am a block comment; You can use me to write
		multiple lines of comments instead of always
		writing // on every starting line		 
		*/
		
		// Let's create some variables
		String name = "Nash",
		       linebreak = "\n";
		int age = 31;
		final int realAge = 937; // I am a 'constant' variable and cannot be changed
		float PIALL = 3.14159265358979f;
		double PI = 3.14;
		char myGPA = 'A';
		boolean IsAFurry = true;
		float scientificNum = 35e3f; // 35 to power of e indicating the power of 10

		// Let's try to change the realAge variable
		//realAge = 999; // Keep this commented or there will be an error

		// Print out the details of our variables
		System.out.println("==== BASIC INFO ====");
		System.out.println("My name is " + name + " and I am " + age + " years old.\n(I am really " + realAge + " years old)");
		
		// Call a method
		PrintLinebreak();

		// Let's do a conditional
		System.out.println("==== ODD FACTS ====");
		if (IsAFurry)
			System.out.println("I am a furry");
		else
			System.out.println("None");
		
		// Call a method
		PrintLinebreak();		

		// Print out a float
		System.out.println("==== MATH THINGS ====)");
		System.out.println("This is how many digits of PI I know: " + PIALL);
		System.out.println("(Printed as double - " + PI + ")");
		System.out.println("I can even show you a scientific number. Right here -> " + scientificNum + "!");
		System.out.print(linebreak);

		// Print a char
		System.out.println("==== SCHOOL INFO ====");
		System.out.println("My GPA is an: " + myGPA);
	}
}
