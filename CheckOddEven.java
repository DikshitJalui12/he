/*
Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
or “Even Number” otherwise. The program shall always print “bye!” before exiting.

*/
import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		System.out.println("The number is = "+ number);
		if(number % 2 == 0){
			System.out.println("EVEN NUMBER");
		}else{
			System.out.println("ODD NUMBER");
		}
		System.out.println("BYE !");
		sc.close(); 
	}
}