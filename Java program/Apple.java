import java.util.Scanner;
public class Apple {

    public static void main(String[] args) {

        int num , i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: \n ");
        num = sc.nextInt();

       for(i=1; i<=10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);

        }
     
    }
    
}
