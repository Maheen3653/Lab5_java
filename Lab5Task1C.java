import java.util.Scanner;

public class Lab5Task1C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
	int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            sum += num;
        }
	 System.out.println(sum);	
	
	 input.close();
    }
}
