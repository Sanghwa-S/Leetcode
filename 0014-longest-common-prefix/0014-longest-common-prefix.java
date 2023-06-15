class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        String lcp = "";
        int index = 0;
        
        if(length<1){
            return lcp;
        }
        while(true){
            char ch;
            if(strs[0].length()<=index){
                return lcp;
            }
            ch = strs[0].charAt(index);
            for(int i=1;i<length;i++){
                if(strs[i].length()<=index){
                    return lcp;
                }
                if(strs[i].charAt(index)!=ch){
                    return lcp;
                }
            }
            index++;
            lcp+=ch;
        }
    }
}
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length==0) return "";
//         String prefix = strs[0];
//         for(int index=1;index<strs.length;index++){
//             while(strs[index].indexOf(prefix) != 0){
//                 prefix=prefix.substring(0,prefix.length()-1);
//             }
//         }
//         return prefix;
//     }
// }

