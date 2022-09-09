import java.util.ArrayList;

public class GrandChildren {
    static int grandChildrenCount=0;
    public static void main(String[] args) {
        String familyTree[][]={{"luke","shaw"},{"wane","rooney"},{"rooney","ronald"},{"shaw","rooney"}};
        ArrayList<String> uniqueNames=new ArrayList<>();
        String grandFather="ronald";

        for(int row=0;row<familyTree.length;row++){
            for(int col=0;col<familyTree[0].length;col++){
                if(!uniqueNames.contains(familyTree[row][col]))
                    uniqueNames.add(familyTree[row][col]);
            }
        }
        System.out.println(uniqueNames.toString());
        int x_Coordinate=-1,y_Coordinate=-1;
        int size=uniqueNames.size();
        int[][] mapArray=new int[size][size];
        for(int rowOfFamilyTree=0;rowOfFamilyTree<familyTree.length;rowOfFamilyTree++){
            for(int colOfFamilyTree=0;colOfFamilyTree<familyTree[0].length;colOfFamilyTree++){
                if(colOfFamilyTree==0){
                    x_Coordinate=uniqueNames.indexOf(familyTree[rowOfFamilyTree][colOfFamilyTree]);
                }
                else if(colOfFamilyTree==1){
                    y_Coordinate=uniqueNames.indexOf(familyTree[rowOfFamilyTree][colOfFamilyTree]);
                }

            }

            mapArray[x_Coordinate][y_Coordinate]=1;
        }
        int grandFatherElementCol=uniqueNames.indexOf(grandFather);
        int fatherElementCol=-1;
        for(int rowOfMapArr=0;rowOfMapArr<mapArray.length;rowOfMapArr++){
            if(mapArray[rowOfMapArr][grandFatherElementCol]==1){
                fatherElementCol=rowOfMapArr;
                findGrandChildren(mapArray,fatherElementCol);
            }
        }
        System.out.println("No of GrandChildren for "+grandFather+" is : "+ grandChildrenCount);
    }
    public static void findGrandChildren(int[][] mapArray,int fatherElementCol){

        for(int rowOfMapArr=0;rowOfMapArr<mapArray.length;rowOfMapArr++){
            if(mapArray[rowOfMapArr][fatherElementCol]==1){
                grandChildrenCount++;
            }
        }
    }
}
