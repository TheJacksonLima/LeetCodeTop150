class Solution {
    public int reverse(int x) {
        boolean negativo=false;
        if (x < 0){
            negativo=true;
            x*=-1;
        }


        int invertido = 0;

        while(x>0){
            int digit = x%10;
            x = x/10;

            if ((invertido > Integer.MAX_VALUE /10) || (invertido > Integer.MAX_VALUE /10 && digit > 7)) return 0;
            if ((invertido < Integer.MIN_VALUE /10) || (invertido < Integer.MIN_VALUE /10 && digit < - 8)) return 0;
            
            invertido = invertido * 10 + digit;

        }

        if (negativo){
          invertido*=-1;      
        }
        
        return invertido;
    }
}