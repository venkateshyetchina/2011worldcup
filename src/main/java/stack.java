import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st= new Stack();
st.add(1);
st.add(3);
st.add(4);
st.add(8);
st.add(5);
Iterator it=st.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
