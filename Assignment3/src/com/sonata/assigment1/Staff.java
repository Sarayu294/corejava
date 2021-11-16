package com.sonata.assigment1;

public class Staff extends Employee{
public void calculatesalary() {
super.hra=0.18*super.BPay;
super.sal=super.sal+hra;
System.out.println("the salary for staff is "+sal);
}
public String toString() {
return "employye id="+EmpId+" ,employee name="+EmpName;
}
Address a1=new Address("123","kakarlavaristreet","nellore","524002");

}