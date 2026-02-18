import java.util.*;
public class NumberHashing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //hash array(assuming numbers are in range of 1 to 100)
        int hash[]=new int[101];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        System.out.print("Enter no. of queries:");
        int q=sc.nextInt();
        while(q>0)  
        {
            int num=sc.nextInt();
            System.out.println("frequency of "+num+" is:"+hash[num]);
            q--;
        }
    }
}
/*OUTPUT:
Enter the size of array:5
Enter array elements:5 6 5 6 9
Enter no. of queries:3
5
frequency of 5 is:2
6
frequency of 6 is:2
9
frequency of 9 is:1 
*/