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
<<<<<<< HEAD
}
=======
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
>>>>>>> 7cafbff5f834eab021314ad4ed7495be25d33d0b
