class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= 0;
        int col= matrix[0].length-1;

        while(col>= 0 && row < matrix.length){
            int current= matrix[row][col];

            if(current == target){
                return true;
            }
            else if(current> target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}