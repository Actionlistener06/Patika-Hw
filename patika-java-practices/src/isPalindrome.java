import java.util.Scanner;

public class isPalindrome {
    public static boolean isPalindrome(String y){
        for(int i=0, j=(y.length()-1); i<j; i++,j--){
            if(y.charAt(i)!=y.charAt(j)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}



