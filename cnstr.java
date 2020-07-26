class student
{ 
 public int sid;
 public String sname;
 public student()
 {
  sid=101;
  sname="denail";
 }
 public String toString()        /*for override*/
 {
  return "hello";
 }
 public  void display()
 {
  System.out.println("\n"+sid+" "+sname+"\n");
 }
}
class cnstr
{
 public static void main(String[]args)
 {
  student s1=new student();
  s1.display();
  System.out.println(s1);
  student s2=new student();
  s2.display();
  System.out.println(s2);
 }
}
