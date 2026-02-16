import java.util.*;
class Print1toN
{
  void f(int i,int n)
    {
        if(i>n)
        {
           return;
        }
        System.out.println(i);
        f(i+1,n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Print1toN p1=new Print1toN();
        System.out.print("\nEnter n:");
        int n=sc.nextInt();
        p1.f(1,n);
    }
}
/*
OUTPUT:
Enter n:5
  1
  2
  3
  4
  5
*/
