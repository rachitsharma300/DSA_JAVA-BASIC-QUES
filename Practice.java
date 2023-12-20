/**
 * Practice
 */
import java.util.*;
public class Practice {

//     public static void main(String[] args) {
        
//         int a = 5;
//         int b = 4;

//         for(int i=0; i<a; i++)
//         {
//             for(int j=0; j<b; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }
public static void main(String[] args) {
    System.out.println("Enter Your Age");

    Scanner scan = new Scanner(System.in);

    int age = scan.nextInt();

    if (age >18) 
    {
        System.out.println("This is adult age");
        
    }
    else 
    {
        System.out.println("This age is not adult");
    }
}
}
