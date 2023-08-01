class Static{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.Schname="bua";

        Student s2 =new Student();
        System.out.println(s2.Schname);
    }
}
class Student{
    String name;
    int roll;

    static String Schname;
    // void setName(String name){
    //     this.name=name;
    // }
    // String getName(String name){
    //     return this.name;
    // }
}