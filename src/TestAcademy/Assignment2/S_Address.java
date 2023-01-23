package TestAcademy.Assignment2;
class S_Address extends Student {
    String Address;
    Double Phone_no;
    public S_Address(int id, String name, String last_name, String address, Double phone_no) {
        super(id, name, last_name);
        this.Address = address;
        this.Phone_no = phone_no;
    }

    @Override
        void Display() { //Display method Overriding from Student  Class to S_Address class
         super.Display();

        System.out.println("\nStudent Information from S_Address Class" + "\nID="+id + "   "
                + "\nname=" + name + " " + "\n" +
                "Last name=" + Last_name + "\nAddress=" + Address + "\nPhone=" + Phone_no);
               }
        void DisplayUsername_Psw() {

            System.out.println("I Have only Address and Phone Number: FROM S_Adress Class");
    }
}
