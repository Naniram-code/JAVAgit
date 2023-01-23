package practicecode;
public final class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public static void main(String[] args) {
        Student student = new Student("Nani Ram Bhujel", 12345);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll Number: " + student.getRollNumber());
    }
}
