import java.util.*;
class PrintNto1
{
    void f(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            System.out.println(n);
            n--;
            f(n);
        }
    }
    public static void main(String args[])
    {
        PrintNto1 p1=new PrintNto1();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter n:");
        int n=sc.nextInt();
        p1.f(n);
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
