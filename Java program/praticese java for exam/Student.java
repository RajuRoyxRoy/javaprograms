import java.util.*;
public class Student{
public static void main(String args[]){
System.out.println("Enter your marks for Science");
Scanner sc = new Scanner(System.in);
    int marks= sc.nextInt();
    if(marks<=100 && marks>=90){
        System.out.println("The grade of the student is A");
         
        }
        else if(marks<=89 && marks>=70){
            System.out.println("The gradeof the student is B");
    }
    else{
        System.out.println("You are fail");
    }

}
}