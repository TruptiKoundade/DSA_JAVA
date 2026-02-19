package Sorting2;
import java.util.*;
public class MergeSort
{
    void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    } 
    void ms(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void mergeSort(int arr[],int n){
        ms(arr,0,n-1);
    }
    public static void main(String args[])
    {
        MergeSort m=new MergeSort();
        int arr[]={5,3,2,4,1};
        int n=arr.length;
        m.mergeSort(arr,n);
        System.out.println("Sorted array:");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
/*OUTPUT:
Sorted array:
1 2 3 4 5  
*/