package com.examples.exception;
class ExceptionDemo3{
void cube(int a)throws NegativeNumberException
{
if(a>0)
System.out.println(a*a*a);
else
throw new NegativeNumberException();
}
public static void main(String ar[]){
try{
int x=Integer.parseInt(ar[0]);
ExceptionDemo3 ed=new ExceptionDemo3();
ed.cube(x);
}catch(NegativeNumberException ne){
System.out.println(ne);
}
}
}
