public class Interface {
    public static void main(String[] args) {
    //    Queen q = new Queen();
    //    q.moves();

      tomy tm = new tomy();
      tm.Leg();
    }
}

// interface Chessplayer{
//     void moves();
// }
// class Queen implements Chessplayer{
//     public void moves(){
//         System.out.println("move in every direction");
//     }
// }

// class Rook implements Chessplayer {
//     public void moves(){
//         System.out.println("Move in up down left right ");
//     }
// }
interface Animal{
    void walk();
}
interface Dog{
    void Leg();
}
class tomy implements Animal,Dog{
   public  void walk(){                        //Multiple inheritance
        System.out.println("run");
    }
    public void Leg(){
        System.out.println("Four legs");
    }
}