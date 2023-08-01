public class hibridInh {
    public static void main(String[] args) {
        Shark sa = new Shark();
        sa.eat();
        sa.swim();
        sa.length=10;
        System.out.println(sa.length);

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

class Shark extends Fish{
    int length;
    void water(){
        System.out.println("Water shower");
    }
}