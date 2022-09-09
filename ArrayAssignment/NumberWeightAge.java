import java.util.Arrays;


public class NumberWeightAge {
    public static void main(String[] args) {
        int[] arr = {49, 36, 8, 10, 12};
        int[][] storeArray = new int[arr.length][2];
        int storeInd = 0;
        for (int ind = 0; ind < arr.length; ind++) {
            int weight = 0;
            int col = 0;

            for (int sq = 1; sq < arr[ind] / 2; sq++) {
                if (sq * sq == arr[ind]) {
                    weight += 5;
                    break;
                }
            }
            if (arr[ind] % 4 == 0 && arr[ind] % 6 == 0) {
                weight += 4;
            }
            if (arr[ind] % 2 == 0) {
                weight += 3;
            }
            storeArray[ind][col++] = arr[ind];
            storeArray[ind][col++] = weight;
        }
        int work_col=1;
        for(int work_Row=0;work_Row<storeArray.length-1;work_Row++){
            for(int curr_Row=work_Row+1;curr_Row<storeArray.length;curr_Row++){

                if(storeArray[work_Row][work_col]<storeArray[curr_Row][work_col]){
                   int temp=storeArray[work_Row][work_col];
                   storeArray[work_Row][work_col]=storeArray[curr_Row][work_col];
                   storeArray[curr_Row][work_col]=temp;

                    temp=storeArray[work_Row][work_col-1];
                    storeArray[work_Row][work_col-1]=storeArray[curr_Row][work_col-1];
                    storeArray[curr_Row][work_col-1]=temp;

                }

            }
        }

        System.out.println(Arrays.deepToString(storeArray));

    }
}
