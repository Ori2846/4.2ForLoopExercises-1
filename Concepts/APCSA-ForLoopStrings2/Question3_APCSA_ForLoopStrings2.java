public class Question3_APCSA_ForLoopStrings2{
    public static void Call() {
        String s1="Elephant";
		String s2 = "Banana";
		String s3 = "evil is a deed as I live";
		String s6 = "racecar";
		String[] s = {s1,s2,s3,s6};
		//System.out.println(reverse(s1));
		for(int i=0;i<s.length;i++)
			{
				System.out.println(reverse(s[i]));
				
			}
        }
	public static String reverse(String str)
		{
		String temp ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+= str.charAt(i);
		}
		return temp;
		}

}
