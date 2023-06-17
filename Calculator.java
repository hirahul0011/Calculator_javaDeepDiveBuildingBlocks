package javaDeepDiveBuildingBlocks_Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticCalculations ac=new ArithmaticCalculations();
		OperationsLoop:
		do{
			System.out.println("Please select the operation that you want to perform:\n"+
		"+. Addition\n"+
		"-. Subtraction\n"+
		"*. Multiplication\n"+
		"/. Division\n"+
		"0. Exit");
			Scanner sc=new Scanner(System.in);
			String o=sc.next();			
			switch(o) {
				case "+":					
					System.out.println("Please enter the first number that you want to add");
					double number1=sc.nextDouble();
					System.out.println("Please enter the second number that you want to add");
					double number2=sc.nextDouble();
					System.out.println("Sum of these numbers is: "+ac.addition(number1, number2));
					break;
				case "-":
					System.out.println("Please enter the first number that you want to subtract from");
					double number3=sc.nextDouble();
					System.out.println("Please enter the second number that you want to subtract to");
					double number4=sc.nextDouble();
					System.out.println("Subtraction of these numbers is: "+ac.subtraction(number3, number4));
					break;
				case "*":
					System.out.println("Please enter the first number that you want to multiply");
					double number5=sc.nextDouble();
					System.out.println("Please enter the second number that you want to multiply");
					double number6=sc.nextDouble();
					System.out.println("Multiplication of these numbers is: "+ac.multiplication(number5, number6));					
					break;
				case "/":
					System.out.println("Please enter the first number that you want to divise to");
					double number7=sc.nextDouble();
					System.out.println("Please enter the second number that you want to divise by");
					double number8=sc.nextDouble();
					System.out.println("Division of these numbers is: "+ac.division(number7, number8));
					break;
				case "0":					
					break OperationsLoop;	
			}
		}while(1!=0);

	}

}

class ArithmaticCalculations{
	public double addition(double a, double b) {
		return a+b;
	}
	public double subtraction(double a, double b) {
		return a-b;
	}
	public double multiplication(double a, double b) {
		return a*b;
	}
	public double division(double a, double b) {
		return a/b;
	}
}
