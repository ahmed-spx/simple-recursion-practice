import java.util.Scanner;

public class Lab7A {

    public static int recursive_multiply(int a, int b){
        int result = a * b;
        if (result==0) {
            return 0;
        } else return recursive_multiply(a,b-1)+a;
    }
    public static int recursive_div(int a, int b){
        if (b == 0){
            return -1;
        } else if (b == 1) {
            return a;
        } else if (b > a) {
            return 0;
        } else return recursive_div(a-b, b)+1;
    }
    public static int recursive_mod(int a, int b){
        if (b == 0){
            return -1;
        } else if (b > a) {
            return a;
        } else return recursive_mod(a-b, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        do {
            System.out.println("Choose from the following" +
                    "\n0. Quit" +
                    "\n1. Multiply 2 numbers" +
                    "\n2. Div 2 numbers" +
                    "\n3. Mod 2 numbers");
            int response = Integer.parseInt(sc.next());
            switch (response) {
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter first number");
                    int afirst = Integer.parseInt(sc.next());
                    System.out.println("Enter second number");
                    int asecond = Integer.parseInt(sc.next());
                    System.out.println("Answer: " + recursive_multiply(afirst, asecond));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    int bfirst = Integer.parseInt(sc.next());
                    System.out.println("Enter second number");
                    int bsecond = Integer.parseInt(sc.next());
                    System.out.println("Answer: " + recursive_div(bfirst, bsecond));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    int cfirst = Integer.parseInt(sc.next());
                    System.out.println("Enter second number");
                    int csecond = Integer.parseInt(sc.next());
                    System.out.println("Answer: " + recursive_mod(cfirst, csecond));
                    break;
                default:System.out.println("Invalid choice");
            }
        }while (!quit);
    }
}
