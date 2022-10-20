public class Question1_APCSA_ForLoopStrings2{
    public static void Call() {
       String s1 = "abrACAdabra";
       String s2 = "pArasItic LYmphatic filariAsis";
       String s3 = "Kraftfahrzeug-Haftpflichtversicherung";
       String S4 = "MOTOR  Vehicle Liability Insurance";
       String S5 = "dryly";
       String s6 = "schadenfreude,  said Mr. Kim dryly";
       String[] s = {s1,s2,s3,S4,S5,s6};
       String[] words = {"a","e","i","o","u","y"};
       for(int i=0;i<s.length;i++){
		   	int count = 0;
		   while(!s[i].equals(""))
			   {
				   for(int n=0;n<words.length;n++)
					   {
			if(s[i].substring(0,1).toLowerCase().equals(words[n]))
						   {
							   count++;
						   }  
					   }
				   s[i]=s[i].substring(1);
			   }
		   System.out.println(count + s[i]);
           }
       }

    
}
