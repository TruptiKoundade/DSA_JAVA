//count subsequences with sum k.
public class countSubsequence {
    int count(int ind,int s,int sum,int arr[],int n)
    {
      if(ind==n)
        {
            if(s==sum)
            {
                return 1;
            }
            else{
                return 0;
            }
        } 
        s+=arr[ind];
        int l=count(ind+1,s,sum,arr,n);
        
        s-=arr[ind];
        int r=count(ind+1,s,sum,arr,n);

        return l+r;
    }
    public static void main(String args[])
    {
        countSubsequence c=new countSubsequence();
        int arr[]={1,2,1};
        int n=arr.length;
        int sum=2;
        int count=c.count(0,0,sum,arr,n);
        System.out.println(sum);
    }
}
/*
OUTPUT:
2
 */
