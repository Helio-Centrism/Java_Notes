//Type casting is Converting a higher data type into a lower one is called narrowing type casting. It is also known as explicit conversion or casting up. It is done manually by the programmer. If we do not perform casting then the compiler reports a compile-time error.

import java.util.*;
public class TypeCasting {
    public static void main(String args[]){
        float b = 25.12f;
        int a =  (int)b;
        System.out.println(a);
        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }

    
}
