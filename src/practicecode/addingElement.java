package practicecode;

public class addingElement {
    public static int[] addtoArray(int[] Array,int value) {
       // public static int[] addtoArray(int[] Array) {
        int[] newArray = new int[Array.length +1];
        //int ba=Array.length;
       // int[] newArray = new int[ba*2];
        for (int i = 0;i< Array.length; i++){
           // for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Array[i];}

      // for (int j = Array.length; j<ba; j++) {
          // newArray[j] = newArray[j];}
        newArray[newArray.length-1]= value;
            return newArray;
        }

    public static void main(String[] args) {
        addingElement obj=new addingElement();
        int[] myarray = new int[]{1, 2, 3, 4, 5};
        //int ba=myarray.length;
       // int[] DArray = new int[ba*2];
       // System.out.println(DArray);
        obj.addtoArray(myarray,6);
        for (int a : myarray) {
            System.out.println(a);}

    }
}
