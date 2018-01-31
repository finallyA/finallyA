package lianxi;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jihe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List list=new ArrayList();
      list.add(2);
      list.add(3);
      list.add(5);
      list.add(10);
      list.add(36);
      list.add(28);
      list.add(71);
      list.remove(3);
      for(Object o:list){
    	  System.out.println(o);
    	
    	  
      }
    
	  System.out.println("------------------------------------------------");
      Set s=new HashSet();
       s.add(1);
       s.add(2);
       s.add(3);
       s.add(4);
       s.add(4);
       s.add(4);
       s.add(4);
       s.add("a");
       s.add("sdasdas");
       s.remove("a");
       for(Object i:s){
    	   System.out.println(i);
       }
     
 	  System.out.println("------------------------------------------------");
       Map m=new HashMap();
       m.put(1, "sdasdsadasdasdas");
       m.put(2, "ssaaawwwwwwwww");
       m.put('q', 12458);
       m.get(2);
       System.out.println( m.get(2));
       m.containsValue("ssaaawwwwwwwww");
       System.out.println(  m.containsValue("ssaaawwwwwwwww"));
       for(Object j:m.keySet()){
    	   System.out.println(m.get(j));
       }
      
 	  System.out.println("------------------------------------------------");
		String h=new String("a");
		String n=new String("a");
		System.out.println(h.equals(n));
       
//     System.out.println(list.size());
//      System.out.println( list.get(2));
//      for(int a=0;a<list.size();a++){
//    	  System.out.println(list.get(a));
//    	  }
   }

}
