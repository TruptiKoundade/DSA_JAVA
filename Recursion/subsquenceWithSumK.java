import java.util.*;
public class subsquenceWithSumK {
    void print(int ind,ArrayList<Integer>ds,int s,int sum,int arr[],int n)
    {
        if(ind==n){
            if(s==sum)
            {
                for(int val:ds){
                    System.out.print(val+" ");
                }
              System.out.println();
            }
            return;
        }
         

        ds.add(arr[ind]);
        s+=arr[ind];
        print(ind+1,ds,s,sum,arr,n);
        
        s-=arr[ind];
        ds.remove(ds.size()-1);
        print(ind+1,ds,s,sum,arr,n);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,1};
        int sum=2;
        int n=arr.length;
        subsquenceWithSumK s=new subsquenceWithSumK();
        ArrayList<Integer>ds=new ArrayList<>();
        s.print(0,ds,0,sum,arr,n);
    }
}
/*
OUTPUT:
1 1 
2  
*/

