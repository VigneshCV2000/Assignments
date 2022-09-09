/*

 1  1  1  1  1  1  1  1  2
 3  2  2  2  2  2  2  2  2
 3  3  3  3  3  3  3  3  4
 5  4  4  4  4  4  4  4  4
 5  5  5  5  5  5  5  5  6
 7  6  6  6  6  6  6  6  6
 7  7  7  7  7  7  7  7  8
 9  8  8  8  8  8  8  8  8
 9  9  9  9  9  9  9  9 10



*/


import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int rep=1;rep<=n;rep++){
                if(line%2==0){
                    if(rep==1){
                        System.out.print(line+1+" ");
                    }
                    else{
                        System.out.print(line+" ");
                    }
                }
                else{
                    if(rep==n){
                        System.out.print(line+1+" ");
                    }
                    else{
                        System.out.print(line+" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
