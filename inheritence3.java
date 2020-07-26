class parent
{
 public int pid;
 public String pname;
 protected void display()
 {
  System.out.println("\n"+pid+" "+pname);
 }
}
class child extends parent // parent class inherites inchildclass.
{ 
 public void display()
 {
  System.out.println("you are in child class");//same methods are use in child class
 //having same signature in parent class by modifying definition.

 }
}
class inheritence3
{
public static void main(String[]args)
{
 parent p1=new parent();
 child c1=new child();
 p1.display();
 c1.display();
}
}



