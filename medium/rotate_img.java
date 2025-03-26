class Solution {
    public void rotate(int[][] matrix) {
        int i,j,aux;
        int l=matrix.length;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(i>j){
                   aux=matrix[i][j];
                   matrix[i][j]=matrix[j][i];
                   matrix[j][i]=aux;
                }
            }
        }
        for(i=0;i<l;i++){
            for(j=0;j<=(l/2)-1;j++){
                aux=matrix[i][j];
                matrix[i][j]=matrix[i][l-j-1];
                matrix[i][l-j-1]=aux;
            }
        }

    }
}