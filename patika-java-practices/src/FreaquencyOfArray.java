import java.util.ArrayList;
import java.util.HashMap;

public class FreaquencyOfArray {
    //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
    /*
    Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    Tekrar Sayıları
    10 sayısı 3 kere tekrar edildi.
    20 sayısı 4 kere tekrar edildi.
    5 sayısı 1 kere tekrar edildi.
    */
    static void findFreqs(int[] arr){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else map.put(arr[i],1);
        }
        for(Integer a: map.keySet()){
            System.out.println(a+" sayisi "+map.get(a)+" kere tekrar edildi");
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        findFreqs(arr);
    }
}
