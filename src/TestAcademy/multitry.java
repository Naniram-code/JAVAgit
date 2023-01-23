package TestAcademy;

import java.util.Scanner;

public class multitry {	public static void main(String[] args) {

    System.out.println("Program is  started..");
    System.out.println("Program is  in progress..");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    String s=null;
    try
    {
        System.out.println(10/num);
        System.out.println(s.length());
    }
    catch(Exception e)
    {   e.printStackTrace();
        System.out.println("exception thown");
    }
    System.out.println("Program is  completed..");
    System.out.println("Program is  exited..");

}
}
