import java.util.*;
public class HashMap1 {
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
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.print("Enter no. of queries:");
        int q=sc.nextInt();
        while(q>0)
        {
            int number=sc.nextInt();
            System.out.println("Frequency: "+map.getOrDefault(number,0));
        }
    }
}
/* 
OUTPUT:
Enter the size of array:7 
Enter array elements:1 2 3 1 3 2 12
Enter no. of queries:5
1 2 3 4 12
Frequency: 2
Frequency: 2
Frequency: 2
Frequency: 0
Frequency: 1
*/
