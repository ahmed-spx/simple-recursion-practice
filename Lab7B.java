import java.util.Scanner;

public class Lab7B {
    public static String repeatNTimes(String s, int i){
        if (i == 0){
            return "";
        } else return repeatNTimes(s,i-1) + s;
    }
    public static boolean isReverse(String s, String ss){
        boolean reverse = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ss.charAt(ss.length() - 1 - i)) {
                reverse = true;
            }
        }
        if (reverse){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));
        System.out.println("Enter the first string");
        String responseOne = sc.next();
        System.out.println("Enter the second string");
        String responseTwo = sc.next();
        if (isReverse(responseOne, responseTwo)){
            System.out.println(responseOne + " is the reverse of " + responseTwo);
        } else System.out.println(responseOne + " is not the reverse of " + responseTwo);
    }
}
