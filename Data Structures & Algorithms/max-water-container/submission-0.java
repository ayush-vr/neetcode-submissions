class Solution {
    public int maxArea(int[] heights) {
        int max=0, low=0, high=heights.length-1;
        while(low<high){
            int area=Math.min(heights[low],heights[high])*(high-low);
            max=Math.max(max, area);
            if(heights[low]<heights[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
