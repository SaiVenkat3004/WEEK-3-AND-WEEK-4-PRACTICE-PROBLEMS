// Problem6 - Count digits in a number
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        while(number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println(count);
    }
}