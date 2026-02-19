package Sorting2;
import java.util.*;
public class QuickSort {
    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j)
        {
            while(i<=high-1 && arr[i]<=pivot)
            {
                i++;
            }
            while(j>=low+1 && arr[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pIndex=partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/*OUTPUT:
Enter no. of elements:5
Enter array elements:
30 20 45 50 10
Sorted array:
10 20 30 45 50  
*/
