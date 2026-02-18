import java.util.ArrayList;

public class PrintAllsubsequence {
    void subsequence(int ind,int arr[],ArrayList<Integer>list)
    {
        if(ind==arr.length)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[ind]);
        subsequence(ind+1,arr,list);
        list.remove(list.size()-1);
        subsequence(ind+1,arr,list);
    }
    public static void main(String args[])
    {
        PrintAllsubsequence p=new PrintAllsubsequence();   
        int arr[]={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();
        p.subsequence(0,arr,list);
    }
}
/*
OUTPUT:
[3, 1, 2]
[3, 1]
[3, 2]
[3]
[1, 2]
[1]
[2]
[]
*/


