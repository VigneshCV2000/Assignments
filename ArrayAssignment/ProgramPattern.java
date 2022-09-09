import java.util.Arrays;

public class ProgramPattern {
    public static void main(String[] args) {
        String patternString="PROGRAM";
        for(int row=0;row<patternString.length();row++){
            for(int col=0;col<patternString.length();col++){
                if(row==col||row+col==patternString.length()-1){
                    System.out.print(patternString.charAt(col)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
