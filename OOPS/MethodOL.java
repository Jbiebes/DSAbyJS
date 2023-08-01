//Method Overloading

public class MethodOL {
    public static void main(String[] args) {
        calculetor cal = new calculetor();
        System.out.println(cal.sum(5,6));
        System.out.println(cal.sum(5.5f,6.4f));
    }
}
class calculetor{
    int sum(int a,int b){
        return (a+b);
    }
    float sum(float a,float b){
        return (a+b);
    }
}