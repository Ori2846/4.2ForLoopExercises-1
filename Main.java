import java.util.Scanner;


class Main {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	System.out.println("Give me a word and I will count the chars:");
		String n = s.next();
		System.out.println("Repeated: "+countWord(n));
	  System.out.println(repeatWords(n,countWord(n)));
  }
	public static int countWord(String n)
	{
		int chars = 0;
		while(!n.equals(""))
			{
				n = n.substring(1);
				chars++;
			}
		return chars;
	}
	public static String repeatWords(String n, int Times)
	{
		String temp = "";
		for(int i = 0; i <Times;i++)
			{
				temp+=n+" ";
			}
		return temp;
	}

}
