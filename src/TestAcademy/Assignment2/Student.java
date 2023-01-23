package TestAcademy.Assignment2;
public class Student {
    int id;
    String name;
    String Last_name;
    public Student(int id, String name, String last_name) {//Constructors for assigning value for variable
        this.id = id;
        this.name = name;
        Last_name = last_name;
    }
    void Display()
  {
      System.out.println("Student Information from Student Class\n"+"ID="+id+" " +
              "  "+"\nname="+name+" "+"\nLast name="+Last_name);
  }

}


