class student
{
 public int sid;
 public String sname;
 public void display()
  {
  System.out.println(sid+" "+sname+"\n");
  }
}
class prg3
{
 public static void main(String[]args)
 {
  student s=new student();
  s.sid=123;
  s.sname="jay";
  s.display();
  student s1=new student();
  s1.sname="john";
  s1.sid=25;
  s1.display();
 }
}

