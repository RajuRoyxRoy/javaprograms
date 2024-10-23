class Animal{  
void eat()
{System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark()
{System.out.println("barking...");}  
}  
class SingleInheritance{  
public static void main(String args[]){  
Dog f =new Dog();  
f.bark();  
f.eat();  
}
}  