class ReversingString 
{
	public static void main(String[] args) 
	{
		String s = "Hello world !!!";
		String reversed = "";
		for (int i = s.length()-1; i>=0 ;i--){
			reversed += s.charAt(i);
		}
		System.out.println("Original string:- "+s);
		System.out.println("Reversed string:- "+reversed);
		System.out.println("");
	}
}
