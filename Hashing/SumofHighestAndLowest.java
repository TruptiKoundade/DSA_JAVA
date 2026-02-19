public class SumofHighestAndLowest {
    public static void main(String args[])
    {
        int arr[]={1,2,3,3,3,2};
        int n=arr.length;

        int maxi=arr[0];
        for(int i=1;i<n;i++)
        {
            maxi=Math.max(maxi,arr[i]);
        }
        int hash[]=new int[maxi+1];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        int maxFreq=0;
        int minFreq=n;

        for(int i=0;i<=maxi;i++)
        {
            if(hash[i]!=0)
            {
                maxFreq=Math.max(maxFreq,hash[i]);
                minFreq=Math.min(minFreq,hash[i]);
            }
        }
        int sum=maxFreq+minFreq;

        System.out.println("Highest frequency:"+maxFreq);
        System.out.println("Lowest frequency:"+minFreq);
        System.out.println("Sum of highest and lowest frequency:"+sum);
    }
    
}
/*OUTPUT:
Highest frequency:3
Lowest frequency:1
Sum of highest and lowest frequency:4 
*/
