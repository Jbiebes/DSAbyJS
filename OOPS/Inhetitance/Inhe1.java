public class Inhe1 {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        Cat meow = new Cat();
        meow.eat();
        meow.breed="tomy";
        System.out.println(meow.breed);
    }
}

//Base Class || Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

class Mamals extends Animal {
    int legs;
}
class Cat extends Mamals{
    String breed;
}

// //Derived Class || Child Class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swiming");
//     }
// }