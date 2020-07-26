class student
{
 public int sid;
 public String sname;
 public void set(int x , String y)
 {
  sid=x;
  sname=y;
 }
 int getsid()
 {
  return sid;
 }
}
class access 
{
 public static void main(String[]args) {
  student s=new student();
  s.set(123,"jhon");
  student s1=new student();
  s1.set(102,"neeraj");
  System.out.println(s.getsid());
  System.out.println(s1.getsid());
  System.out.println(s.toString());
  System.out.println(s1);
 }
}

