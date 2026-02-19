public class HighestOccuringElement{
   public static void main(String args[])
   {
    int arr[]={1,2,3,3,3,2};
    int n=arr.length;
    int max=arr[0];
    for(int i=0;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    int hash[]=new int[max+1];
    for(int i=0;i<n;i++)
    {
        hash[arr[i]]++;
    }
    int maxCount=0;
    int element=-1;
    for(int i=0;i<=max;i++)
    {
       if(hash[i]>maxCount){
        maxCount=hash[i];
        element=i;
       }
    }
    System.out.println("Highest occuring element:"+element);
    System.out.println("Frequency:"+maxCount);;
   }    
}
/*OUTPUT:
Highest occuring element:3
Frequency:3 
*/
