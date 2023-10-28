import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
       // int matrix1[][]={{1,2,3,4,5},{3,6,7,8,9},{6,11,12,13,14},{3,16,17,18,19},{3,6,7,8,9}};
        //  spiral_matrix(matrix);
        //  print_matrix(matrix);

        int sum=0;
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

    }
    public static void print_matrix(int matrix[][]){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    public static void spiral_matrix(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startColumn=0;
        int endColumn=matrix[0].length-1;

        while (startRow<=endRow && startColumn<=endColumn ){
            //top
            for (int i=startColumn;i<=endColumn;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //right
            for (int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endColumn]+" ");
            }
            //bottom
            for (int i=endColumn-1;i>=startColumn;i--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for (int j=endRow-1;j>=startRow+1;j--){
                if (startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[j][startColumn]+" ");
            }

           // System.out.println();
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }
    //diagonal sum normal method;
    public static int diagonal_sum(int matrix[][]){
        int sum=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (i==j){
                    sum+=matrix[i][j];
                }
                if (i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    //diagonal sum optimized method
    public static int diagonal_sumOpm(int matrix[][]){
        int sum = 0;
        for (int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if (i!=matrix.length-1-i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
       return sum;
    }

}

