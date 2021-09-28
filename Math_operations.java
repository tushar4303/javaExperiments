import java.util.Scanner;
public class Math_operations {
    static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static void testArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        int r, sum = 0;
        int temp = x;
        while (x > 0) {
            r = x % 10;
            sum = sum + (r * r * r);
            x /= 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not Armstrong");
        }


    }

    static void testPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        int r, sum = 0;
        int temp = x;
        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x /= 10;
        }

        if (sum == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    static void testPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int d = sc.nextInt();

        int i = 2;
        boolean flag = false;
        while (i <= d / 2) {

            if (d % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(d + " is a prime number.");
        else
            System.out.println(d + " is not a prime number.");
    }


    static void fibonacciSeries() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int x1 = 0, x2 = 1, x3;
        System.out.println("The fibonacci series is :");
        for (int i = 1; i <= n; i++) {
            System.out.print(+x1 + " ");
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your choice:\n1 to calculate Factorial.\n2 to test Armstrong.\n3 to test Palindrome.\n4 to test Prime number.\n5 for Fibonacci series.\n6 to exit.");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The factorial =" + factorial());
                    break;
                case 2:
                    testArmstrong();
                    break;
                case 3:
                    testPalindrome();
                    break;
                case 4:
                    testPrime();
                    break;
                case 5:
                    fibonacciSeries();
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("INVALID INPUT");

            }

        }


    }
}
