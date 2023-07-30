import java.sql.Array;
import java.util.Arrays;

public class MatrisTranspoze {

    static int[][] transpoze(int[][] arr){
        int[][] arrsol = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arrsol[j][i]=arr[i][j];
            }
        }
        return arrsol;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        for(int[] a: transpoze(arr)){
            for(int b: a){
                System.out.println(b);
            }
        }

    }
}
