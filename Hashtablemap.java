import java.util.*;

public class Hashtablemap {
    public static void main(String args[]){
        Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
        ht.put(11,"r");
        ht.put(11,"r");
       // ht.put(null,null);
        Set st= ht.entrySet();
        Iterator itt= st.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }
        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        hm.put(99,"r");
        hm.put(null,null);
        hm.put(98,null);
        hm.put(97,"a");
        Iterator itm=hm.entrySet().iterator();
        while (itm.hasNext()) {
            Map.Entry mp=(Map.Entry)itm.next();
            System.out.println(mp.getKey()+" "+mp.getValue());
           // System.out.println(itm.next());
        }

        for(Map.Entry et: hm.entrySet()){
            System.out.println(et.getKey()+" : "+et.getValue());
        }

    }
}
