package java01;

public class Test3 {
	public static void main(String[] args) {
/*
		int a=4,b=6,c=8;
		String s="abc";
		System.out.println(a+b+s+c);
		System.out.println();*/
		
		byte b=10;
		
		System.out.println(getType(b*b));
	}
	
	public static String getType(Object o){ //获取变量类型方法
		return o.getClass().toString(); //使用int类型的getClass()方法
		} 
	
}
