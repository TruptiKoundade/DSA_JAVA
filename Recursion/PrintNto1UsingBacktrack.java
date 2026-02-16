import java.util.*;
public class PrintNto1UsingBacktrack {
    void f(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        else{
            f(i+1,n);
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PrintNto1UsingBacktrack p1=new PrintNto1UsingBacktrack();
        System.out.print("Enter n:");
        int n=sc.nextInt();
        p1.f(1,n);
    }
}
/*
OUTPUT:
Enter n:5
5
4
3
2
1 
*/

