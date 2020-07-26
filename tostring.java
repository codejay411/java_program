class student
{ 
 public int sid;
 public String sname;
 public student()
 {
  sid=101;
  sname="denail";
 }
 public student(int x, String y)
 {
  sid=x;
  sname=y;
 }
 public String toString()        /*for override*/
 {
  return (sid+sname);
 }
}
class tostring
{
 public static void main(String[]args)
 {
  student s1=new student();
  System.out.println(s1.toString());
  student s2=new student(465,"neeraj");
  System.out.println(s2.toString());
 }
}
