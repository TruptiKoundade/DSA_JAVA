/*Parameterised recursion*/
import java.util.*;
public class SumOfFirstNnumbers {
    void f(int i,int sum)
    {
        if(i<1)
        {
            System.out.print(sum);
            return;
        }
        f(i-1,sum+i);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SumOfFirstNnumbers r1=new SumOfFirstNnumbers();
        System.out.print("\nEnter n:");
        int n=sc.nextInt();
        r1.f(n,0);
    }
}
/*
OUTPUT:
Enter n:5
15 
*/
