/*
Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if
the int variable "dayNumber" is 0, 1, ..., 6, respectively. Otherwise, it shall print "Not a valid day". Use
(a) a "nested-if" statement; (b) a "switch-case-default" statement
*/

import java.util.Scanner;
public class PrintDayInWord {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day number : ");
		int Day = sc.nextInt();
		
		switch(Day) {
			case 1 : System.out.println("MONDAY");
					break;
			case 2 : System.out.println("TUESDAY");
					break;
			case 3 : System.out.println("WEDNESDAY");
					break;
			case 4 : System.out.println("THURSDAY");
					break;
			case 5 : System.out.println("FRIDAY");
					break;
			case 6 : System.out.println("SATURDAY");
					break;
			case 7 : System.out.println("SUNDAY");
					break;
			default : System.out.println("NOT VALID DAY");
					break;
		}sc.close();
	}
}