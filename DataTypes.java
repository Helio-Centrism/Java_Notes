// Data types in Java are classified into two categories: primitive and non-primitive.
// Primitive data types are fundamental, and they include byte, short, int, long, float, double, char, and boolean.
// Size of Datatypes:
// - byte: 1 byte [-128 to 127]
// - short: 2 bytes [-32,768 to 32,767]
// - char: 2 bytes [0 to 65,535]
// - boolean: 1 bit [true or false]
// - int: 4 bytes [-2^31 to (2^31)-1]
// - long: 8 bytes [-2^63 to (2^63)-1]
// - float: 4 bytes [approximate range of 3.4 x 10^-38 to 3.4 x 10^38]
// - double: 8 bytes [approximate range of 1.7 x 10^-308 to 1.7 x 10^308]


public class DataTypes {
    public static void main(String args[]) {

        // In Java, we use variables to store data. The type of data a variable can hold is determined by its data type.

        byte b = 8; 
        // Byte data type is 8 bits or 1 byte in size.
        // It can store values in the range of [-128 to 127].
        System.out.println("Byte: " + b);

        char ch = 'a'; 
        // Char data type is 16 bits or 2 bytes in size.
        // It stores a single Unicode character.
        System.out.println("Character: " + ch);

        boolean var = true; 
        // Boolean data type is 1 bit in size.
        // It can only store true or false values.
        System.out.println("Boolean: " + var);

        short numbe = 240; 
        // Short data type is 16 bits or 2 bytes in size.
        // It can store values in the range of [-32,768 to 32,767].
        System.out.println("Short: " + numbe);

        int number = 23; 
        // Int data type is 32 bits or 4 bytes in size.
        // It can store values in the range of [-2^31 to (2^31)-1].
        System.out.println("Int: " + number);

        long numbers = 33344334L; 
        // Long data type is 64 bits or 8 bytes in size.
        // It can store values in the range of [-2^63 to (2^63)-1].
        System.out.println("Long: " + numbers);

        float price = 10.58f; 
        // Float data type is 32 bits or 4 bytes in size.
        // It is used for decimal numbers and requires an 'f' or 'F' suffix.
        System.out.println("Float: " + price);

        double prices = 12.2434535532545; 
        // Double data type is 64 bits or 8 bytes in size.
        // It is used for precise decimal numbers.
        System.out.println("Double: " + prices);


        //Non-primitive data types in Java are also known as reference types.
        //Unlike primitive data types, which store the actual values, non-primitive data types store references or addresses to objects.
        //These objects can be instances of classes, arrays, interfaces, etc.
    }
}


