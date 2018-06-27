package com.imooc;

public class Test {

	public static void main(String[] args) {
		//Singleton sg=new Singleton();
		  Singleton s1=Singleton.getInstance();
		  Singleton s2=Singleton.getInstance();
		  System.out.println(s1==s2);
		  
		  //ÀÁººÄ£Ê½
		  Singleton2 s3=Singleton2.getInstance();
		  Singleton2 s4=Singleton2.getInstance();
		  System.out.println(s3==s4);
	}

}
