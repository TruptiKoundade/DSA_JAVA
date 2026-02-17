import java.util.*;
public class factorial {
    int f(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*f(n-1);
        }
    }
    public static void main(String args[])
    {
        factorial f1=new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter n:");
        int n=sc.nextInt();
        int result=f1.f(n);
        System.out.println("The factorial is:"+result);
    }
}
/*
OUTPUT: 
Enter n:5
The factorial is:120
*/
 

