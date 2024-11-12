class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Mammal extends Animal{
    void breathe(){
        System.out.println("Mammal breaths air");}}
class Dog extends Mammal{
void bark(){
System.out.println("Dog barks");
}
}
    
public class Animall {
    public static void main(String[]args){
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        dog.breathe();}
    
}
