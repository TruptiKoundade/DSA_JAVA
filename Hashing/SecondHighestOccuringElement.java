class SecondHighestOccuringElement {
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
     int el1=-1,el2=-1;
     int el1Freq=0,el2Freq=0;

     for(int i=0;i<=max;i++)
     {
        int count=hash[i];
        if(count==0)
        {
         continue;
        }
        if(count>el1Freq)
        {
            el2Freq=el1Freq;
            el2=el1;

            el1Freq=count;
            el1=i;
        }
        else if(count>el2Freq)
        {
            el2Freq=count;
            el2=i;
        }
     }
     System.out.println("Highest occuring element:"+el1+" with frequency:"+el1Freq);
     System.out.println("Second Highest occuring element:"+el2+" with frequency:"+el2Freq);
   }
}
/*
OUTPUT:
Highest occuring element:3 with frequency:3
Second Highest occuring element:2 with frequency:2 
*/
