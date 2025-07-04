class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        List<Integer> ele = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ele.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ele.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ele.add(matrix[bottom][i]);
                }
            bottom--;
            }
            if(left<=right){
           
                for(int i=bottom;i>=top;i--){
                    ele.add(matrix[i][left]);
                }
            left++;
            }
        }
        return ele;
    }
}