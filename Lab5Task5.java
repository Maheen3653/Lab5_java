import java.util.Scanner;

public class Lab5Task5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number;
	int max = 0;
	System.out.println("Enter a sequence of integers : ");

	do{
	  number = input.nextInt();
	  
	  if (max < number){
	    max = number;
	  }
	}

	while (number != 0);
	

	System.out.println("The largest number of the sequence is " + max);
	input.close();
	}
}