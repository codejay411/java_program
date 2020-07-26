class employee
{
 public int id;
 public String name;
 public String email;
 public String mob;
 public void display()
  {
  System.out.println("\n"+id+" "+name+" "+email+" "+mob+"\n");
  }
 public void set(int x , String y , String z , String a)
 {
  id=x;
  name=y;
  email=z;
  mob=a;
 }
}
class company
{
 public static void main(String[]args)
 {
  employee s1=new employee();
  employee s2=new employee();
  employee s3=new employee();
  s1.set(123,"amar","amar@123gmail.com","3625846572");
  s2.set(537,"jay","jaypr202@gmail.com","8887624847");
  s3.set(975,"aryan","aryan545@gmail.com","9875623478");
  s1.display();
  s2.display();
  s3.display();
 }
}

