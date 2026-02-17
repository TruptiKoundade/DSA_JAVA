public class ArrayReverse {
    void reverse(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);
    }
    public static void main(String args[])
    {
        ArrayReverse r=new ArrayReverse();
        int arr[]={1,2,3,4,5};
        int n=arr.length-1;
        r.reverse(arr,0,n);
        System.out.print("Reversed array:");
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/*OUTPUT:
Reversed array:5 4 3 2 1 
 */
