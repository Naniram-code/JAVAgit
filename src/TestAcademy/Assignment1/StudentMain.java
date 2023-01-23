package TestAcademy.Assignment1;


import TestAcademy.Assignment1.Student;

public class StudentMain {
    public static void main(String[] args)
{
    Student[] arr=new Student[10];;
    arr[0] = new Student(100, "Nani",'9');
    arr[1] = new Student(101, "Ria",'8');
    arr[2] = new Student(102, "Ajim",'7');
    arr[3] = new Student(103, "Rash",'6');
    arr[4] = new Student(104, "Mina",'7');
    arr[5] = new Student(105, "Ram Kumar",'9');
    arr[6] = new Student(106, "Maheshwari",'8');
    arr[7] = new Student(107, "Lokesh",'5');
    arr[8] = new Student(108, "Sujata",'5');
    arr[9] = new Student(109, "Gopal",'8');

    for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}

}

}


