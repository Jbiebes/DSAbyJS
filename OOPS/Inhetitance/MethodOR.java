//Method Overriding
public class MethodOR {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dear dear = new Dear();
        dear.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("Eat only grass");
    }
}
