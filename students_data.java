class Student { // Class names should start with an uppercase letter
    private String name;
    private int DSA, OOPS, DBMS; 

    public Student(String n, int a, int b, int c) {
        name = n;
        DSA = a;
        OOPS = b;
        DBMS = c;
    }

    public String toString() {
        double percent = (DSA + OOPS + DBMS) * 100.0 / 180;
        return String.format("%s - %.1f%%", name, percent);
    }
}

public class students_data {
    public static void main(String[] args) {
        Student s = new Student("Alex", 45, 43, 48);
        System.out.println(s);
    }
}
