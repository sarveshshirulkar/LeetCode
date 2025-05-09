class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowCheck = new int[m];
        int[] colCheck = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    rowCheck[i] = -1;
                    colCheck[j] = -1;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(rowCheck[i] == -1 || colCheck[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
