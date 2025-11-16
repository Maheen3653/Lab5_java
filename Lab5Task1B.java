import java.util.Scanner;

import java.util.Scanner;
public class Lab5Task1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) 
                System.out.print(i + " ");
        } else {
            for (int i = A; i >= B; i--)
                System.out.print(i + " ");
            }
	input.close();
    }
}
