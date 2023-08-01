public class Hierarchialinh {
    public static void main(String[] args) {
        Mamals m1 = new Mamals();
        m1.color="red";
        System.out.println(m1.color);
        m1.eat();
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

class Mamals extends Animal{
    void Walk(){
        System.out.println("Walking");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swiming");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}