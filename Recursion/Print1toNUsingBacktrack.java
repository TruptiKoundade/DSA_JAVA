import java.util.*;
public class Print1toNUsingBacktrack {
     void f(int i,int n)
     {
        if(i<1)
        {
            return;
        }
        else
        {
            f(i-1,n);
            System.out.println(i);
        }
     }
     public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      Print1toNUsingBacktrack p1=new Print1toNUsingBacktrack();
      System.out.print("Enter n:");
      int n=sc.nextInt();
      p1.f(n,n);
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
