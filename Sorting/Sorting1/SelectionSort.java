package Sorting;

import java.util.*;
class SelectionSort
{
    void selectionSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
           int min=i;
           for(int j=i+1;j<n;j++)
           {
             if(arr[j]<arr[min])
                {
                   min=j;
                }
           }
           int temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SelectionSort s=new SelectionSort();
        System.out.println("\nEnter the size of array:");
        int n=sc.nextInt();
        int i,j;
        int arr[]=new int[20];
        System.out.print("\nEnter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        s.selectionSort(arr,n);
        System.out.println("\nSorted Array:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}