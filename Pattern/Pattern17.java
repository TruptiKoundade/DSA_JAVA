package Pattern;

public class Pattern17 {
    void print(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern17 p=new Pattern17();
        p.print(5);
    }
}

/*
OUTPUT:
A 
B B
C C C
D D D D
E E E E E
 */

