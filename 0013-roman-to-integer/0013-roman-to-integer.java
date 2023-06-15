class Solution {
    public int romanToInt(String s) {
        char before = 0;
        char current = 0;
        int length = s.length();
        int sum = 0;
        
        for(int i=0; i<length; i++){
            
            current = s.charAt(i);
            
            if(before == 'I' && current == 'V') //4
                sum+=3;
            else if(before == 'I' && current == 'X') //9
                sum+=8;
            else if(before == 'X' && current == 'L') //40
                sum+=30;
            else if(before == 'X' && current == 'C') //90
                sum+=80;
            else if(before == 'C' && current == 'D') //400
                sum+=300;
            else if(before == 'C' && current == 'M') //900
                sum+=800;
            else if(current == 'I')
                sum+=1;
            else if(current == 'V')
                sum+=5;
            else if(current == 'X')
                sum+=10;
            else if(current == 'L')
                sum+=50;
            else if(current == 'C')
                sum+=100;
            else if(current == 'D')
                sum+=500;
            else if(current == 'M')
                sum+=1000;
            
            before = current;
        }
        return sum;
    }
}