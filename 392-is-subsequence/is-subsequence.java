class Solution {
    public boolean isSubsequence(String s, String t) {
        if ((s.length() > t.length()) || (t.length() == 0) && (s.length() > 0))
        {
            return false;
        }

        if ((s.length() == 0) && (t.length() > 0)) 
        {
            return true;
        }

        if ((s.length() == 0) && (t.length() == 0)){
            return true;
        }

        if (s.length() == t.length()){
            if (s == t)
                return true;
            else
                return false;
        }
        


        int i=0;       
        int contFound=0;       
        char aux = s.charAt(i);

        for(char c : t.toCharArray()){
            System.out.println("c: "+c+ " aux:"+aux+ " i:"+i+" countFound: "+contFound);
            if  (c == aux){
                contFound+=1;
                if ((s.length()-1) > i){ 
                   i++;
                }
                aux = s.charAt(i);
            }
        }

        System.out.println("i: "+i+" aux: "+aux+ " s.length(): "+s.length()+" contFound: "+contFound);
        if (contFound == (s.length())){
            return true;
        }

        return false;


    }
}