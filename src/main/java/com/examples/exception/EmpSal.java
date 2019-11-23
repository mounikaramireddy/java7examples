package com.examples.exception;
public class EmpSal{
public void decidesal(String s) throws NSalException,PSalException,NumberFormatException{
int sal=Integer.parseInt(s);
if(sal<=0){
NSalException ne=new NSalException("invalid salary");
throw(ne);
}else{
PSalException pe=new PSalException("valid salary");
throw(pe);
}
}
}