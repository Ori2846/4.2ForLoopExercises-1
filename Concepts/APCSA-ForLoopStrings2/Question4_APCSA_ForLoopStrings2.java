import java.util.Scanner;
public class Question4_APCSA_ForLoopStrings2{
    public static void Call() {
		System.out.println("Give me a series of numbers to run");
		Scanner s = new Scanner(System.in);
		String s2 = s.next();
		System.out.println(run_(s2));
        }
	public static String run_(String str)
	{
		int counter = 0;
		int prevcounter=0;
		char precharcounted = str.charAt(0);
		char charcounted = str.charAt(0);
		for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==charcounted)
				{
					counter++;
				} else
				{
					if(prevcounter<=counter)
					{
					prevcounter=counter;
					precharcounted=charcounted;	
					}
					counter=1;
					charcounted = str.charAt(i);
				}
			}
		//System.out.println(prevcounter+" -- "+precharcounted);
		//System.out.println(counter+" -- "+charcounted);
		return "I have counted "+prevcounter+" run numbers of the number "+precharcounted;
	}
}