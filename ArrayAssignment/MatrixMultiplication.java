import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat1=getElements(sc);
        int[][] mat2=getElements(sc);

        int row_Size1=mat1.length;
        int col_Size1=mat1[0].length;

        int row_Size2=mat2.length;
        int col_Size2=mat2[0].length;
        if(row_Size2!=col_Size1){
            System.out.println("Matrix Multiplication not possible");
        }
        else{
            int[][] mat3=new int[row_Size1][col_Size2];
            for(int row=0;row<row_Size1;row++){
                for(int col=0;col<col_Size2;col++){
                    for(int k=0;k<row_Size1;k++){
                        mat3[row][col]+=mat1[row][k]*mat2[k][col];
                    }
                }
            }
            System.out.println(Arrays.deepToString(mat3));
        }


    }
    public static int[][] getElements(Scanner sc){
        System.out.println("Enter the row for matrix 1:");
        int row_Size=sc.nextInt();
        System.out.println("Enter the col for matrix 2:");
        int col_Size=sc.nextInt();
        int[][] mat=new int[row_Size][col_Size];
        System.out.println("Enter the elements for the matrix :");
        for(int row=0;row<row_Size;row++){
            for(int col=0;col<col_Size;col++){
                mat[row][col]=sc.nextInt();
            }
        }
        return mat;
    }


}
