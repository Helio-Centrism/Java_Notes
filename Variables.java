//Variables are the data containers that save the data values during Java program execution.
//Java variable is a name given to a memory location. It is the basic unit of storage in a program.

//The value stored in a variable can be changed during program execution.
//Variables in Java are only a name given to a memory location. All the operations done on the variable affect that memory location.
//In Java, all variables must be declared before use.
//2*(a+b) here a,b are variables and 2 will always be same throughout the program hence these values are known as literals
//variables,main ,string, int are identifiers
public class Variables {
    public static void main(String args[]){
        int a = 10;
        int b = 25;
        int c = 2 * (a + b) ;
        System.out.println(a);
        System.out.println(c);
        System.out.println(c*a);
        String name = "Naruto";
        System.out.println(name);

        //at any point we can change the values of the variables or can be compare with each other 
        a = 90;
        System.out.println(a);
        a = b;
        System.out.println(a);
    }
}
