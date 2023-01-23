package practicecode;
public class thisKeywordInsideStatic {
    int variable1;
    static int variable2;

    public void nonStaticMethod() {
        variable1 = 5; // Using "this" to access the instance variable
        this.variable1 = 5; // Same as above
        variable2 = 10; // Using class name to access the static variable
        //thisKeywordInsideStatic.variable2 = 10; // Same as above
        System.out.println(thisKeywordInsideStatic.variable2);
    }
    public static void staticMethod() {
        // "this" cannot be used here as it is a static method
        variable2 = 20; // Using class name to access the static variable
        //thisKeywordInsideStatic.variable2 = 20; // Same as above
        System.out.println(thisKeywordInsideStatic.variable2);
    }
    public static void main(String[] args) {
        thisKeywordInsideStatic obj= new thisKeywordInsideStatic();
        obj.nonStaticMethod();
        thisKeywordInsideStatic.staticMethod();

    }}
//No, you cannot use the keyword "this" inside a static method in Java.
// "this" refers to the current instance of an object,
// and a static method is associated with a class, not an instance of that class.
//If you //try to use "this" inside a static method, the compiler will give an
// error because "this" cannot be used in a static context.
