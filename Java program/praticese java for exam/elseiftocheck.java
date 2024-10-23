import java.util.*;
public class elseiftocheck {
  public static void main(String arg []){
    System.out.println("To check which number is greater or smaller or equal eneter the number");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enetr a");
    double a =sc.nextDouble();
    System.out.println("Enetr b");
    double b =sc.nextDouble();
    if(a==b){
        System.out.println("Both number are equal.");
    }
        else if(a>b){
            System.out.println("A is greater than B"); 
        }
        else{
            System.out.println("B is greater than A");
        }
    }
  }  

