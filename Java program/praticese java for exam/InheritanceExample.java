class Employee{
  float salary=40000;
 }
 
 class InheritanceExample extends Employee{
  int bonus=10000;
  public static void main(String args[]){
    InheritanceExample p=new InheritanceExample();
    System.out.println("Programmer salary is:"+p.salary);
    System.out.println("Bonus of Programmer is:"+p.bonus);
 }
 }
 