class parent
{
 protected int pid;
 protected String pname;
 public void display()
 {
  System.out.println("\n"+pid+" "+pname);
 }
}
class child extends parent      // parent class inherites in child class.
{ 
 public void display()
 {
  System.out.println("you are in child class");//same methods are use in child class
 //having same signature in parent class by modifying definition.

 }
}
class inheritence2
{
public static void main(String[]args)
{
 child c1=new child();
 c1.display();
}
}



