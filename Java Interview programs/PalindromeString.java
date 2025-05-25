class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s = "ADADA";
		String reversed = "";
		for (int i = s.length()-1; i>=0 ;i--)
			{
			reversed += s.charAt(i);
			}
		if (s.equals(reversed))
			{
			System.out.println("The given string is palindrome.");
		    }
		else
			{
				System.out.println("The given string is not palindrome.");
			}
			System.out.println("");
	}
}
