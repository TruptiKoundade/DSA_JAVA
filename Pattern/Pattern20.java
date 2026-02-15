package Pattern;

public class Pattern20 {
    void print(int n)
    {
        int space=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
              System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space+=2;
        }
        space=2*n-2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
               System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
    public static void main(String args[])
    {
        Pattern20 p=new Pattern20();
        int n=5;
        p.print(n);

    }
}

/*
OUTPUT:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/