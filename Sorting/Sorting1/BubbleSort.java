import java.util.*;
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[20];
        int i,j,temp;
        System.out.println("\nEnter the size of array:");
        int n=sc.nextInt();

        System.out.println("\nEnter array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("\nThe sorted Array:");
        for(i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
}
