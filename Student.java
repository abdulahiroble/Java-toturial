/**
 * Student
 */
public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Student test) {
        if (this.name == test.name) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name;
    }
}