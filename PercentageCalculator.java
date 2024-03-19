import java.util.*;
import java.io.*;
public class PercentageCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a=sc.nextInt();
        System.out.print("Enter the number b:");
        int b=sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1: +(Addition)");
        System.out.println("2: -(Subtraction)");
        System.out.println("4: * (Multiplication)");
        System.out.println("3: /(Division)");
        System.out.println("5: %(Modulo)");
   

        int operation=sc.nextInt();
        switch(operation){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:if(b==0){
                System.out.println("Inavlid division");
            }
            else{
                System.out.println(a/b);
            }
           
            break;
            case 4:System.out.println(a*b);
            break;
            case 5:if(b==0){
                System.out.println("Invalid Division");
            }
            else{
                System.out.println(a%b);
            }
            
            break;
            default:System.out.println("Invalid Operator");
        }
    }
}
