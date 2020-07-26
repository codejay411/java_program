class student
{ 
 private int sid;
 private String sname;
 public void setsid(int x)
 {
  sid=x;
 }
 public int getsid()
 {
  return sid;
 }
 public void setsname(String y)
 {
  sname=y;
 }
 public String getsname()
 {
  return sname;
 }
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
class encapsulation
{
 public static void main(String[]args)
 {
  student s1=new student();
  s1.display();
  s1.setsid(121);
  s1.setsname("neeraj");
  System.out.println(s1.getsid()+" "+s1.getsname());
  student s2=new student();
  s2.setsid(345);
  s2.setsname("himanshu");
  System.out.println(s2.getsid()+" "+s2.getsname());
 }
}
