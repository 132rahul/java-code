import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testcomparable {
    public static void main(String args[]) {

    List<Student> lt = new ArrayList<>();
    lt.add(new Student(10,"r","3a"));
    lt.add(new Student(11,"a","4a"));
    lt.add(new Student(9,"q","5w"));

        Comparator<Student> ct=new Comparator<Student>() {
            @Override
            public int compare(Student obj1, Student obj2) {
                if (obj1.getRollno() > obj2.getRollno()){
                    return 1;
                }
                else
                return -1;
            }
        };

    Collections.sort(lt,ct);   //Comparator
    //Collections.sort(lt);   //comparbale
    for (Student st:lt){
        System.out.println(st.getRollno()+" "+st.getName()+" "+st.getClassnmae());
    }
    }
}
