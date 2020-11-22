import java.util.List;

public class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private String classnmae;

    public Student(int rollno,String name,String classnmae){
        this.rollno=rollno;
        this.name=name;
        this.classnmae=classnmae;
    }
    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassnmae() {
        return classnmae;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setClassnmae(String classnmae) {
        this.classnmae = classnmae;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", classnmae='" + classnmae + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        if (this.getRollno()> obj.getRollno()){
            return 1;
        }
        else
        return -2;
    }
}
