package CollectionFramework;

import java.util.*;

public class Array_List {
   public static void main(String[] args) {
    
      List<Integer> list = new ArrayList();

      list.add(1); // add element at end
      list.add(2);
      list.add(10);
      list.add(3);
      list.add(4);

      /* 
      list.add(2,5); // add element by index
      System.out.println(list);

      System.out.println(list.get(1));

      list.remove(0); // remove element by index
      System.out.println(list);
      
      list.remove(Integer.valueOf(3)); // remove element by value
      System.out.println(list);

      list.set(2, 1000); // to update element at perticular index
      System.out.println(list);

      System.out.println(list.contains(1000)); // to check if element is present in list or not

      list.clear();
      System.out.println(list);
      */
      /* 
      List<Integer> list1 = new ArrayList<>();
      list1.add(1000);
      list1.add(2000);
    
      list.addAll(list1); // adding 1 list to another
      System.out.println(list);
      */

      // Iterating the list
      /* 
      for(int i=0; i<list.size(); i++){
         System.out.println(list.get(i));
      }

      for(Integer ele : list){
         System.out.println(ele);
      }
      */

      Iterator<Integer> it = list.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }
   } 
}
