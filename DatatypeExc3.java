import java.util.*;
public class DatatypeExc3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of three items");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pen + pencil + eraser;
        
        System.out.println("the total cost of ur items is : " + cost);

        float gst = cost + (cost * 18)/100;
        System.out.println("the total cost of ur items including gst  is : " + gst);
    }
    
}
