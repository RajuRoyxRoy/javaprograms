import java.util.*;  
class validdate{
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in); 
    int date, month, valid=0;
    System.out.println("Enter the Date. \n");
    date= sc.nextInt();
    System.out.println("Enter the month. \n");
    month= sc.nextInt();
    switch(month){
        case 1:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n January \n");
        valid=1;
        }
        break;
        case 2:
        if(date>=1 && date<=28){
    
        System.out.println(" The month is :\n February \n");
        valid=1;
        }
        break;
        case 3:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n March \n");
        valid=1;
        }
        break;
        case 4:
        if(date>=1 && date<=30){
    
        System.out.println(" The month is :\n April \n");
        valid=1;
        }
        break;
        case 5:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n May \n");
        valid=1;
        }
        break;
        case 6:
        if(date>=1 && date<=30){
    
        System.out.println(" The month is :\n June \n");
        valid=1;
        }
        break;
        case 7:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n July\n");
        valid=1;
        }
        break;
        case 8:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n August \n");
        valid=1;
        }
        break;
        case 9:
        if(date>=1 && date<=30){
    
        System.out.println(" The month is :\n September\n");
        valid=1;
        }
        break;
        case 10:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is :\n October \n");
        valid=1;
        }
        break;
        case 11:
        if(date>=1 && date<=30){
    
        System.out.println(" The month is :\n November \n");
        valid=1;
        }
        break;
        case 12:
        if(date>=1 && date<=31){
    
        System.out.println(" The month is:\n December \n");
        valid=1;
        }
        break;
        default:
        valid= 0;
    
    }
    System.out.println("The date is: "+date);
   
    if(valid==1){
        System.out.println("The date and month is valid");
       
    }
     else{
         System.out.println("The date and month is Invalid");   
        }


    } 
}