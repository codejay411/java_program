class parent
{
 public int pid;
 public String pname;
 public void display()
 {
  System.out.println("\n"+pid+" "+pname);
 }
}
class child extends parent
{ 

}
class inheritence
{
public static void main(String[]args)
{
 child c1=new child();
 c1.display();
}
}



