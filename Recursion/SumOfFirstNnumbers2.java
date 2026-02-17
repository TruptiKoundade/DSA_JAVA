/*Using Functional recursion */
import java.util.*;
class SumOfFirstNnumbers2
{
    int f(int n)
    {
        if(n==0)
        {
          return 0;
        }
        else{
            return n+f(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SumOfFirstNnumbers2 s1=new SumOfFirstNnumbers2();
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int result=s1.f(n);
        System.out.println("The sum is:"+result);
    }
}
/*OUTPUT:
Enter n:5
The sum is:15
*/