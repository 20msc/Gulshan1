package com.pack1;

public class ClassA 
{
	public static void main(String[] args) 
	{
		System.out.println("hi");
		new ClassA().mul(10,25);
	}
	void mul(int x,int y)
	{
		System.out.println("multiplication:"+(x*y));
	}

}
