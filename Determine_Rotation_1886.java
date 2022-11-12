public class Determine_Rotation_1886 {
    public boolean findRotation(int[][] matrix, int[][] target) {
        int rotations  = 4;
        while(rotations>0)
        {
            rotate(matrix);
            if(check(matrix, target))
                return true;
            rotations--;
        }
        return false;

    }
    public boolean check(int matrix[][], int target[][])
    {
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j< matrix[0].length; j++)
            {
                if(matrix[i][j]==target[i][j])
                    continue;
                else
                    return false;
            }
        return true;
    }
    public void rotate(int matrix[][])
    {
        for(int i=0; i<matrix.length; i++)
            for(int j=i; j<matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length/2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = temp;
            }
    }
}
