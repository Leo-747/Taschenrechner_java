import java.util.Scanner;

public class Mane {
    public static int div(int a, int b) {
        return (a / b);
    }public static int multy(int a, int b) {
        return (a * b);
    }public static int plus(int a, int b) {
        return (a + b);
    }public static int minus(int a, int b) {
        return (a - b);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String reply =  input.nextLine();
            if (reply.equals("plus")) {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(plus(a, b));
            }else if (reply.equals("minus")) {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(minus(a, b));
            }else if (reply.equals("multy")) {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(multy(a, b));
            }else if (reply.equals("divide")) {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(div(a, b));
            }else if  (reply.equals("stop")) {
                break;
            }     }
    }
}

