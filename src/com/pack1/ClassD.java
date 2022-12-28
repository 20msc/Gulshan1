package com.pack1;

public class ClassD
{
	void meth1()
	{
		int a=10;//variable
		System.out.println("a value is : "+a);
		System.out.println(90-a);//90-10=80
		ClassD aobj=new ClassD();//Creating an object
		aobj.meth2();//calling method
		System.out.println(1000);
		
	}
	void meth2()
	{
		int a=99;//Varible
		System.out.println("meth2 called");
		System.out.println("addition value===>"+(a+1));
		
	}
	
	
	public static void main(String[] args)
	{
	System.out.println("hii");
	ClassD aobj=new ClassD();//creating an object
	aobj.meth1();//calling method
	System.out.println("end");
	
	}
}
