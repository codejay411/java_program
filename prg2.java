class student
{
 public int sid;
 public String sname;
 public void display()
  {
  System.out.println(sid+" "+sname+"\n");
  }
}
class prg2
{
 public static void main(String[]args)
 {
  student s=new student();
  s.display();
  s.sid=123;
  s.sname="jay";
  s.display();
 }
}

