class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length,
                n = mat[0].length,
                row = 0,
                column = 0;
        int[] res = new int[m*n];

        for(int i=0; i<res.length; i++){
            res[i] = mat[row][column];

            if((row+column)%2 == 0){ // arrow go to top right

                if(row == 0 && column < n-1)
                {
                    column++;
                }
                else if(column == n-1){//// your current location is edge or end
                    row++;
                }
                else{
                    row--;
                    column++;
                }
            }
            else{ // arrow go to bottom left

                if(column == 0 && row < m-1){
                    row++;
                }
                else if(row == m-1){
                    column++;
                }
                else{
                    row++;
                    column--;
                }
            }
        }

        return res;
    }
}