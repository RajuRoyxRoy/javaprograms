
import java.util.Scanner;

public class insert_in_existing_loop {

    public static void main(String[] args) {
        int i, element=0;
        int[] arr = new int[20];
        try (Scanner scan = new Scanner(System.in)) {
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of array: \n ");
                element = sc.nextInt();

            System.out.println("Enter the  Elements: \n ");
            for (i = 0; i < element; i++)
                arr[i] = scan.nextInt();

            System.out.println("Enter new Element to Insert: \n ");
            element = scan.nextInt();
            arr[i] = element;
            
            }
        }
        

        System.out.println("\n Now the new array is: \n ");
        for (i = 0; i < element; i++)
            System.out.print(arr[i] + " ");

    }
    

}