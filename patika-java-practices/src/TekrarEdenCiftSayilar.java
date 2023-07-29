public class TekrarEdenCiftSayilar{
  //Tekrar eden çift sayıları bulan program

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int[] count = new int[list.length];
        int[] repeat = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            int tempCount = 0;
            for (int j = 0; j < list.length; j++) {
                if (temp == list[j]) {
                    tempCount++;
                }
            }
            if (tempCount > 1) {
                count[index] = tempCount;
                repeat[index] = temp;
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(repeat[i] + " sayısı " + count[i] + " kere tekrar edildi.");
        }
    }

}