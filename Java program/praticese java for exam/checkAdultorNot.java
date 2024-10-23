import java.util.*;
public class checkAdultorNot {
    public static void main(String args[]){
        System.out.println("Enter your age \n");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You are an Adult and you age is "+age);
        }
        else{
            System.out.println("You are not an adult and your age is "+age);
        }

    }
}
