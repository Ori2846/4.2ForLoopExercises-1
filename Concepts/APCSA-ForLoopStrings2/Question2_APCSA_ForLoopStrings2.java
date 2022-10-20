public class Question2_APCSA_ForLoopStrings2{
    public static void Call() {
        String[] word = {"kingdom", "praying", "parasitic", "munchies"};
        String[] sub  = {"ping", "ray", "para", "unh"};
        boolean[] ans = {false, true, true, false};
        
        System.out.println("+-----------------------------------------+");
        System.out.println("Word \t\tsub \tYou \tTruth\n");

        for (int n=0 ; n<ans.length ; n++){
            System.out.println(word[n]+" \t"+sub[n]+"\t"+hasSub(word[n], sub[n])+"\t"+ans[n]);
        }
        
    }
    
  
    
    public static boolean hasSub(String word, String sub){

        // Yeah, replace this with a for loop
		for(int i=0; i<word.length()-3;i++)
			{
				if(word.substring(i,i+3).equals(sub))
					return true;
			}
		return false;
    }

}
    
