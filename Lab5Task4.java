import java.util.Scanner;

public class Lab5Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
	int num = input.nextInt();

        while (num != 0) {
        count++;
	num = input.nextInt();
        }

        System.out.println(count);

        input.close();
    }
}
