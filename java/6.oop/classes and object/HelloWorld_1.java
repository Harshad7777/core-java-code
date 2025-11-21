/* 1. Create a Class and Print a Message Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called. Explanation: Helps understand class and method creation.
 */
 
public class HelloWorld_1 
{
    // Method to print the message
    public void printMessage() 
	{
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) 
	{
        // Create object of the class
        HelloWorld_1 obj = new HelloWorld_1();
        
        // Call the method
        obj.printMessage();
    }
}

/* java HelloWorld_1.java
Hello, World! */
