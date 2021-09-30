package DynamicProgramming;

public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        boolean flag=false;
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        
        int[][] mat=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            if(flag || obstacleGrid[i][0]==1){
                mat[i][0]=0;
                flag=true;
            }
            else{
                mat[i][0]=1;
            }
        }
        
        flag=false;
        for(int j=0;j<cols;j++){
            if(flag || obstacleGrid[0][j]==1){
                mat[0][j]=0;
                flag=true;
            }
            else{
                mat[0][j]=1;
            }
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(obstacleGrid[i][j]==1){
                    mat[i][j]=0;
                }
                else{
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                }
            }
        }
        
        return mat[rows-1][cols-1];
    }
}