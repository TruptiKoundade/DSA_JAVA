package Pattern;

public class Pattern14 {
    void print(int n)
    {
        int space=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(j);
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
              System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public static void main(String args[])
    {
        Pattern14 p=new Pattern14();
        p.print(4);
    }

}

/*
OUTPUT:
1      1
12    21
123  321
12344321
 */
