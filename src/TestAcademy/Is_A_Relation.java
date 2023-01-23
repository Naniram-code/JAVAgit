package TestAcademy;
public class Is_A_Relation {
    //In oops This object is a type of that object//inheritance concept extends keyword used
    public static void main(String[] args) {

        apple aobj=new apple();
        aobj.disply();
        aobj.print();
    }
}
class Fruits
     {
    void disply(){
      System.out.println("I am Fruit Family" );
}
}
class apple extends Fruits
{ void print()
{
    System.out.println("I am apple and I am also fruit");
}
}