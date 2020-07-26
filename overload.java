/*overloading*/

class number
{
 public void sum(int a,int b)
 {
  System.out.println(a+b);
 }
 public void sum(int a,int b,int c)
 {
  System.out.println(a+b+c);
 }
 public void sum(float a,float b)
 {
  System.out.println(a+b);
 }
/*first and third function are not same due to differnet function signature, by differt datatype .*/
 public void sum(int x,float y)
 {
  System.out.println(x+y);
 }
 public void sum(float u,int v)
 {
  System.out.println(u+v);
 }

}
class overload
{
 public static void main(String[]args)
 {
  number n1=new number();
  n1.sum(4,5);
  number n2=new number();
  n2.sum(4.2f,5);
  number n3=new number();
  n3.sum(7,8,9);
 }
}











