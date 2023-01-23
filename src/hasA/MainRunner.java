package hasA;

import TestAcademy.Assignment1.Student;

public class MainRunner {
    public static void main(String[] args) {
        Vehical[] V=new Vehical[4];
        V[0] = new Vehical(350, "Ford");
        V[1] = new Vehical(340, "Tesla");
        V[2] = new Vehical(350, "Honda");
        V[3] = new Vehical(360, "Toyota");
        //Vehical V=new Vehical(370,"Telse");

        Driver[] Dobj=new Driver[4];
         Dobj[0]=new Driver("nani",V[0]);
         Dobj[1]=new Driver("nani",V[1]);
         Dobj[2]=new Driver("nani",V[2]);
         Dobj[3]=new Driver("nani",V[3]);
        for(int i=0;i<=V.length-1;i++)
        {
            System.out.println(Dobj[i]);

        String ss= Dobj[i].showDriverDiscription();
        System.out.println(ss);
    }}
}
