public class fibonacci {
    int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last=fib(n-1);
        int slast=fib(n-2);

        return last+slast;
    }
    public static void main(String args[])
    {
        fibonacci f1=new fibonacci();
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.print(f1.fib(i)+" ");
        }
    }
}
/*
OUTPUT:
0 1 1 2 3 5  
*/
