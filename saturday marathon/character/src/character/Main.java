package character;

class Main
{

	static void check(char ch)
	{
	
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("\n" + ch +
					" is an UpperCase character");
	
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("\n" + ch +
					" is an LowerCase character" );
	
		else
			System.out.println("\n" + ch +
					" is not an alphabetic character" );
	}


	public static void main(String []args)
	{
		char ch;
	
		// Get the character
		ch = 'A';
	
		// Check the character
		check(ch);
	
		// Get the character
		ch = 'a';
	
		// Check the character
		check(ch);
	
		// Get the character
		ch = '0';
	
		// Check the character
		check(ch);
	
	}
}

