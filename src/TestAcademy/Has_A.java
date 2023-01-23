package TestAcademy;
class room{
    void showroom(){
        Table table= new Table();
        table.howmanyTable();
    }
}
class Table{
    void howmanyTable()
    {
        System.out.println("5");
    }
}
public class Has_A {
    public static void main(String[] args) {
        new room().showroom();
    }
}