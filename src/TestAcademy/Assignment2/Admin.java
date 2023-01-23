package TestAcademy.Assignment2;

public class Admin extends S_Address {
    String User_name;
    String Password;
    @Override
    public String toString() {
        return "Admin{" +
                "User_name='" + User_name + '\'' +
                ", Password='" + Password + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone_no=" + Phone_no +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                "} " + super.toString();
    }
    Admin(int id, String name, String Last_name, String Address, Double Phone_no,
          String User_name, String Password) {
        super(id, name, Last_name, Address, Phone_no);
        this.User_name=User_name;
        this.Password=Password;
    }
    void DisplayUsername_Psw(int id,String Username_name,String Password)
       {
         //Overloading DisplayUsername_Psw from class S_address to admin class
        System.out.println("\nUser ID ,name and password from Admin Class ="+"\nID=" + id +
                " "+"\nUser_Name=" +User_name +"\nPassword= " + Password);

    }
}
