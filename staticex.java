class number
{
 public static int count=0;
 public number()
    {
        count++;
    }
    public static int getcount()
    {
        return count;
    }
}
class staticex
{
public static void main(String[]args)
 {
   number n1=new number();
        System.out.println(n1.getcount());
        number n2=new number();
        System.out.println(n2.getcount());
        number n3=new number();
        System.out.println(n3.getcount());
                
 }
}