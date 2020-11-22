import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class Hashmap {
    public static void main(String args[]){
        Map<Integer, String> m1=new HashMap<Integer, String>();
        m1.put(1,"r");
        m1.put(2,"a");
        m1.put(3,"e");
       // Set s1=m1.entrySet();

        Iterator<Integer> itk=m1.keySet().iterator();
        while (itk.hasNext()){
            System.out.println(itk.next());
        }

        Iterator<Map.Entry<Integer, String>> itr1=m1.entrySet().iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            //Map.Entry mf = (Map.Entry)itr1.next();
            //System.out.println(mf.getKey()+" "+mf.getValue());
        }

        for(Map.Entry m:m1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println(m1.get(1));

    }
}
