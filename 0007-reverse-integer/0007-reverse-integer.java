class Solution {
    public int reverse(int x) {
        long result = 0;
        int sign = x>0 ? 1:-1;
        x = Math.abs(x);
        int mul = (int)Math.log10(x);
        
        while(x>0) {
            int remains = x%10;
            x= x/10;
            
            if(result > Integer.MAX_VALUE){
                return 0;
            }    
            
            result += remains*Math.pow(10,mul);
            mul--;
        }
        
        return (int)result*sign;
    }
}