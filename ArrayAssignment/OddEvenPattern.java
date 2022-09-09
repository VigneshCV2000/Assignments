import java.util.Arrays;
import java.util.Scanner;

public class OddEvenPattern {
    public static void main(String[] args) {
        int[] arr=getArray();
        sort(arr);
        int size= arr.length;
        int mid=size/2;
        System.out.print(arr[mid]+" ");
        int x=mid+1;
        int y=mid-1;
        while(x< arr.length && y>=0){
            System.out.print(arr[x++]+" "+arr[y--]+" ");
        }
        
    }
    public static int[] getArray(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int ind=0;ind<arr.length;ind++){
            arr[ind]=sc.nextInt();
        }
        return arr;
    }
    public static int[] sort(int[] arr){
        int min_ind=0;
        for(int work_ind=0;work_ind< arr.length-1;work_ind++){
            int min=Integer.MAX_VALUE;
            for(int ind=work_ind;ind<arr.length;ind++){
                if(arr[ind]<min){
                    min=arr[ind];
                    min_ind=ind;
                }
                int temp=arr[work_ind];
                arr[work_ind]=arr[min_ind];
                arr[min_ind]=temp;

            }
        }
        return arr;

    }
}
