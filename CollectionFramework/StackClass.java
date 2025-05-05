package CollectionFramework;
import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        
        System.out.println(st.peek());
        
        st.pop();

        System.out.println(st);

        for(Integer i : st){
            System.out.println(i);
        }
    }
}
