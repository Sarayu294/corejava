package com.sonata.assigment;

public class Employee {
int empId;
String empName;
double empSal;
public void salcal(double sal) {
this.empSal=sal;
}
public void display() {
System.out.println(empId);
System.out.println(empName);
System.out.println(empSal);
}
public static void main(String[] args) {
Employee e1 = new Employee();
e1.empId=12;
e1.empName="sarayu";
e1.salcal(8000);
e1.display();
Manager m1 = new Manager();
m1.empId=34;
m1.empName="sujith";
m1.salcal(9000);
m1.display();
Tester t1 = new Tester();
t1.empId=56;
t1.empName="nikhil";
t1.salcal(6000);
t1.display();
Developer d1 = new Developer();
d1.empId=78;
d1.empName="vyshu";
d1.salcal(5000);
d1.display();
}



}
	  