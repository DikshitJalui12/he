/*
Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or
equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
*/
import java.util.Scanner;
public class CheckPassFail {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int mark = sc.nextInt();
		System.out.println("The mark is "+ mark);
		
		if(mark >= 50 && mark <=100){
			System.out.println("PASS");
		}else if(mark >100){
				System.out.println("INVALID MARKS");
			}
		else{
			System.out.println("FAIL");
		}
		System.out.println("DONE");
		sc.close();
	}
}