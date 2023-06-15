// So, now you ask which pointer we suppose to move. It's preety simple. We gonna move the smaller height pointer. Why?
// Because, we are trying to find very max. container

// If we have smaller height on left or right we don't care about it. We always want a higher height line on our left & right.

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while(left < right) {
            int width = right - left;
            int h = Math.min(height[left],height[right]);
            int tempArea = width * h;
            maxArea = Math.max(maxArea, tempArea);
            
            if(height[left] > height[right]){
                right--;
            }
            else if(height[left] < height[right]){
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}


// 시간 초과 떴음
// class Solution {
//     public int maxArea(int[] height) {
//         // two pointer
//         // 높이는 움직이는 기준이랑 비교하여 작은거 (세로)
//         // 투포인터의 길이 (가로)
//         // 하나씩 넓이 값을 구해서 비교하여 저장된 최대 넓이값을 리턴
        
//         int maxValue = 0;
        
//         for(int i=0; i<height.length; i++) {
//             for(int j=i+1; j<height.length; j++ ){
//                 int area = Math.min(height[i],height[j]) * (j-i);
//                 maxValue = Math.max(maxValue, area);
//             }
//         }
//         return maxValue;
//     }
// }