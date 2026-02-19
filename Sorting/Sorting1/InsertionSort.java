import java.util.*;
public class InsertionSort {
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,j,temp,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        n=sc.nextInt();
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       for(i=1;i<n;i++)
       {
        temp=a[i];
        j=i-1;
        while(j>=0 && a[j]>temp)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=temp;
       }
       System.out.print("Sorted array elements:");
       for(i=0;i<n;i++)
       {
        System.out.print(a[i]+" ");
       }
    }
}
/*OUTPUT:
Enter size of array:5
Enter array elements:
30 20 40 15 35
Sorted array elements:15 20 30 35 40  
*/
