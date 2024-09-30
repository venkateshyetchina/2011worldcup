package groupss.group;

public class innerclassess {
	int a=0;
	class inner1{
	
	int a=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 innerclassess i= new innerclassess();
 innerclassess.inner1 w= i.new inner1();
 System.out.println(i.a);
	}

}
