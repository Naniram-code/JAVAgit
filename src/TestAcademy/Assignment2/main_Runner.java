package TestAcademy.Assignment2;
public class main_Runner {

        public static void main(String[] args) {

            Admin[] add = new Admin[6];
            add[0] = new Admin(100, "Nani", "Bhujel",
                    "Delhi", 23423423D, "Naniram", "sdjfk");
            add[1] = new Admin(101, "Ram", "Khan",
                    "DDDXXX", 23427723D, "Ram_dd", "krjfk");
            add[2] = new Admin(102, "Guru", "Duddta",
                    "Delhi", 23423423D, "Guru_Dutta", "lkkjfs");
            add[3] = new Admin(103, "Suraj", "Sing",
                    "Delhi", 23423423D, "Suraj_singh", "lksfks");
            add[4] = new Admin(104, "Rohan", "Khan",
                    "Delhi", 23423423D, "Rohan_Khan", "dsnf889");
            add[5] = new Admin(105, "Suzan", "Sahil",
                    "Delhi", 23423423D, "Suzan_Sahil", "fsdkfnks09");

            add[0].DisplayUsername_Psw(100, "Naniram", "sdjfk");//Calling DisplayUsername_Psw of Admin Class method
            for (int i = 0; i <= add.length - 1; i++) {
                add[i].Display();//Calling Display Method of S_Address Class
                add[i].DisplayUsername_Psw();//Calling DisplayUsername_Psw Method of S_Address Class
            }
            S_Address SAobj = new S_Address(555, "Rahul", "Shitty", "India", 23423423D);
                    SAobj.Display();//Calling method of S_Address class
            System.out.println("All information =");
            for (int i = 0; i <= add.length-1;i++) {
                System.out.println(add[i]);// printing all Details
            }}

        }






