public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal{
    String color;
    Animal () {
        color ="Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Works on 4 legs");
    }
    void Changecolor () {
        color="white";
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Works on 2 legs");
    }
}