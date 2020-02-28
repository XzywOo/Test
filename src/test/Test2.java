package test;

public class Test2 implements Define {

	@Override
	public void abc() {
	    	  System.out.println("Connection of test2 is OK!");
	}
	public static void main (String[] args) {
	      	Test1 c = new Test1();
	      	Test2 d = new Test2();
	      	//相同接口，不同实现方法
	      	c.abc();
	      	d.abc();
	      	System.out.println(a);
	      	System.out.println(b);
	      	System.out.println(a+b);
	      	String x="ZJN=100";
	      	if(a+b>100)
	      		System.out.println("ERROR");
	      	else if(a+b<100)
	      		System.out.println("ERROR");
	      	else if(a+b==100)
	      		System.out.println(x);
	      }

}
