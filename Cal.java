import java.util.*;
public class Cal
{
	public static int[]number() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		return new int[]{a,b};
	}
	public static void addition(int a,int b) {
		int result1=a+b;
		System.out.println("the sum="+ result1);
	}
	public static void substraction(int a,int b) {
		System.out.println("the substraction= " + (a-b));
	}
	public static void multiply(int a,int b) {
		System.out.println("the multiplication is= " + (a*b));
	}
	public static void divide(int a,int b){
	   try {
            int result = a / b;
            System.out.println("The division is = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not possible.");
        }
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select following arithmetic operations:");
		System.out.println("Enter Operation number");
		System.out.println("1.add 2.sub 3.multiplication 4.Division");
		int option=sc.nextInt();
		if(option == 1) {
			Cal cal=new Cal();
			int[] numbers=cal.number();
			cal.addition(numbers[0],numbers[1]);
		} else if(option == 2) {
			Cal cal=new Cal();
			int[] numbers=cal.number();
			cal.substraction(numbers[0],numbers[1]);
		}
		else if(option==3){
		    Cal cal=new Cal();
			int[] numbers=cal.number();
			cal.multiply(numbers[0],numbers[1]);
		}
		else if(option==4){
		    Cal cal=new Cal();
			int[] numbers=cal.number();
			cal.divide(numbers[0],numbers[1]);
		}
		else{
		    System.out.println("Invalid Option");
		}

	}
}