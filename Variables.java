package com.learning;

public class Variables {
	
	// Refer diagram for images.
	// https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/
	
	// instance variable will be inside a class but not within a method.
	// stored in heap memory
	// public variable can be accessed from any class within or outside package
	// Need to call from an object. Variables myVariable = new Variables(); myVariable.weight;
	public int weight = 100;
	
	// private variable can be used within same class
	private int height = 5000;
	
	// if nothing mentioned access specifier will be default.
	// this can be accessed within same package
	int sight = 100;
	
	// Final Variable can never be changed or assigned a new value
	// When we try to assign a new value, we get java.lang.Error 
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The final field Variables.earthGravity cannot be assigned
		at com.learning.Variables.main(Variables.java:20)*/
	final float earthGravity = 9.8f;
	
	// will be stored in static memory
	// No need to create an object
	// Example : Variables.distance , here we can call directly with className
	public static int distance = 200;
	
	public void getValues() {

		// local variable will be inside a method/function
		// stored in stack memory
		float temperature = 100.1f;
		System.out.println(height);
		
	}
	
	// Method signature - public void printMessage()
	// void mean method does not return anything
	// Method can accept or can not accept input parameters / params
	public void printMessage() {
		System.out.println("Simple Print Message");
	}
	
	// For static method non need to create the object
	public static void printStaticMessage() {
		System.out.println("Simple Static Print Message");
	}
	
	// + sign is used for string concatenation. Example 
	public void printNumber(int number) {
		String message1 = "Sample message one";
		String message2 = "Hello Suhas";
		System.out.println(message1 + " : " + message2);
		System.out.println("Provided number to print is : " + number);
	}
	
	public int addNumbers(int number1, int number2) {
		int result = number1 + number2;
		return result;
	}
	
	public String getMessage() {
		String message = "Get sample message";
		return message;
	}

}
