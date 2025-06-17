package Homework;
import java.util.Scanner;
public class Q4{
	static long factorial(int num)// reverse multiplication
	{
		if(num<=1 && num>=0)// both the condition should be true then it returns 1
			return 1;
		return num*factorial(num-1);// formula for factorial
	}
	static int fibo(int num)
	{
		if(num==0 && num>=0)//both the condition should be true
			return 0;
		if(num==1 && num>=0)
			return 1;
		return fibo(num-1)+fibo(num-2); //formula for fibinoci
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial will be: "+factorial(n));// printing factorial
		System.out.println("Fibonacci Series will be:");// printing fibonacci
		for(int i=0;i<n;i++)
		{
			System.out.println(fibo(i));
			
		}
	}
}