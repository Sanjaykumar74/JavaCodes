//reading input from the user
/*
c-c++ -> developers have given some inbuilt functions and variables. to use those we have to call the header files 
#include<stdio.h>
in java -> there are packages. package contain methods, classes, interfaces and variables. to use those, we have to import the package

import java-> main package  util -> actual package -> * all classes
import java.util.*; all classes of util package
import java.util.Scanner; only scanner class in imported
*/
import java.util.*;
class Userinput
{
	public static void main(String args[])
	{
	//we have to create the object of scanner class
	//classname objectname=new classname(System.in); new allocate memory and System.in -> for input
	/*
	int -> s1.nextInt();
	float -> s1.nextFloat();
	double ->s1.nextDouble();
	string -> s1.nextLine();
	char -> s1.nextLine().charAt(0);
	*/
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		//a=10; we will read the value from user
		System.out.println("Enter 2 numbers a and b:");
		a=s1.nextInt();
		b=s1.nextInt();
		c=a+b;
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println("Sum = "+c);

	}
}