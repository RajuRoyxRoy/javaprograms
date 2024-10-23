import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args) {
   
     int num, count;
     Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to find prime numbers: \n ");
num = sc.nextInt();
   
     for (int i = 2; i <= num; i++) {
      count = 0;
      for (int j = 2; j <= i / 2; j++) {
       if (i % j == 0) {
        count++;
        break;
       }
      }
   
      if (count == 0) {
       System.out.println(i);
      }
   
     }
    }
   }