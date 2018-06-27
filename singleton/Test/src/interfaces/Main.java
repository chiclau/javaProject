package interfaces;

public class Main {
	public static void main(String[] args) {
		//声明接口，将接口的实现类赋值给接口的声明
		OneInterface one=new OneInterfaceImpl();
	System.out.println(one.hello("world"));	
	}
}
