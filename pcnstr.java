class student
{ 
 public int sid;
 public String sname;
 public student()
 {
  sid=101;
  sname="denail";
 }
 public student(int x ,  String y)
 {
  sid=x;
  sname=y;
 }
 public  void display()
 {
  System.out.println("\n"+sid+" "+sname+"\n");
 }
}
class pcnstr
{
 public static void main(String[]args)
 {
  student s1=new student();
  s1.display();
  student s2=new student(109,"john");
  s2.display();
 }
}
