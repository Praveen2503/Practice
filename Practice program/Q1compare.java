package Homework;
import java.util.*;
public class Q1compare {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	if(x==y && y==z) {
		System.out.println("All are equal");
	}
	else if(x==y || y==z) {
		System.out.println("Two are equal");
	}
	else {
		System.out.println("all are not equal");
	}
	sc.close();
}
}






