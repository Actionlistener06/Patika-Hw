public class ArrayOrt {
    //dizideki elemanların harmonik ortalamasını hesaplayan program
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0;
        for (int i : list) {
            sum += 1.0/i;
        }
        System.out.println(list.length/sum);
    }
    
}
