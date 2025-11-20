class Solution {
    public int convertToInt(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public int romanToInt(String s) {
        int max_size = s.length();
        int counter = 0;
        int num = 0 ,previous_num = 0;

        for(int i=0;i<max_size;i++){
            num = convertToInt(s.charAt(i));
            
            if (previous_num == 1) {
                if (num == 5) num = 3;
                if (num == 10) num = 8;
            }
            else if (previous_num == 10){
                if (num == 50) num = 30;
                if (num == 100) num = 80;
            }
            else if (previous_num == 100) {
                if (num == 500) num = 300;
                if (num == 1000) num = 800;
                    

            }

            counter = counter + num;
            previous_num = num;
            //System.out.println("counter: "+counter);
        }        

        return counter;
    }
}