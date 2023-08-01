public class SuperClass {
    public static void main(String[] args) {
        Horse h =new Horse();
        h.hi();
    }
}
class Animal{
    Animal(){
        System.out.println("animal constractor is called");
    }
}
class Horse extends Animal{
    
    Horse(){
        super();
        System.out.println("horse constractor is called");
    }
   void hi(){
    System.out.println("hi");
    }
}