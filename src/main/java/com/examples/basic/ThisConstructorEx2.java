package com.examples.basic;
class ThisConstructorEx2{
int a,b;
ThisConstructorEx2()
{
a=0;b=0;}
ThisConstructorEx2(int a,int b)
{this.a=a;
this.b=b;
}
public static void main(String arg[])
{
	ThisConstructorEx2 t11=new ThisConstructorEx2();
}
}