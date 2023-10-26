import java.util.Scanner;

public class Input {
    public static void main(String args[]) {

        // To take input from users, we declare a Scanner class.
        Scanner sc = new Scanner(System.in);

        // Taking input using sc.next(), which stops at the first space
        String input = sc.next();
        System.out.println("Input (sc.next()): " + input);

        // To take the entire line as input, use sc.nextLine()
        String name = sc.nextLine();
        System.out.println("Name (sc.nextLine()): " + name);

        // Different data types can be read using appropriate methods
        int number = sc.nextInt();
        System.out.println("Number (sc.nextInt()): " + number);

        float price = sc.nextFloat();
        System.out.println("Price (sc.nextFloat()): " + price);

        byte b = sc.nextByte();
        System.out.println("Byte (sc.nextByte()): " + b);

        double num = sc.nextDouble();
        System.out.println("Double (sc.nextDouble()): " + num);

        long numb = sc.nextLong();
        System.out.println("Long (sc.nextLong()): " + numb);

        boolean c = sc.nextBoolean();
        System.out.println("Boolean (sc.nextBoolean()): " + c);

        short numbers = sc.nextShort();
        System.out.println("Short (sc.nextShort()): " + numbers);

        // Close the Scanner to avoid resource leaks
        sc.close();
        /*When we all  create an instance of the Scanner class to read input from the user, it internally uses system resources to interact with the underlying input stream (usually System.in for keyboard input).
         If you don't explicitly close the Scanner when you're done using it, these resources might not be released properly, leading to what is known as a "resource leak."
        A "resource leak" occurs when a program doesn't release resources (such as file handles, network connections, or input/output streams) after it's done using them. This can lead to inefficiency, and in some cases, it might cause issues like not being able to open new streams due to resource exhaustion.
        In Java, it's a good practice to close resources explicitly when you're done using them. For classes that implement the AutoCloseable interface (including Scanner), you can use the close method to release resources. The close method is typically called to indicate that the object (in this case, the Scanner) is no longer needed, and any associated resources can be released.
        Here's the relevant part of the code with the comment explaining the importance of closing the Scanner: */
    }
}

