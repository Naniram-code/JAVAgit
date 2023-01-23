package TestAcademy.Assignment1;

public class Student {
        int id;
        String name;
        char grade;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name=name;
        this.grade=grade;
    }


    }






