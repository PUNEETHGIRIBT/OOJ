import java.util.Scanner;

class sumofdigits {

    public static void main(String args[]) {

        long number, sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");

        number = sc.nextLong();

        for (sum = 0; number != 0; number = number / 10) {

            sum = sum + number % 10;

        }

        System.out.println("Sum of digits: " + sum);

    }

}