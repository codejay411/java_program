import java.lang.*;
class Employee
{
 public int eid;
 public String ename;
 public Employee(int x, String y)
 {
  eid=x;
  ename=y;
 } 

/*
public Employee(int eid , String ename)
 {
  this.eid=eid;
  this.ename=ename;
 } 
both are same in differnt forms.
these are also local variable.
*/
 public void show()
 {
  System.out.println("\n"+eid+" "+ename+" \n");
 }
}
class Manager extends Employee
{
 public String depname;     /*there are three member variable for                              child class*/
 public Manager(int pid,String pname,String depname)
 {
  super(pid,pname);/* refers to the constructor of parent class.
                      call the parameterized constructor of                      parent class without inherites.*/
  this.depname=depname;

 }
 public void show()
 {
  super.show();
  System.out.println(depname);
 }

}
class general
{
 public static void main(String[]args)
 {
  Manager m1=new Manager(101,"manoj","IT");
  m1.show();
  Employee e1=new Employee(134,"aryan");
  e1.show();
 }
}
















