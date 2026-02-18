//This is used in case if we don't know the letters are uppercase or lowercase
import java.util.*;
class CharacterHashing3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();

        int hash[]=new int[255];
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
        }
        System.out.print("Enter no. of queries:");
        int q=sc.nextInt();

        while(q>0)
        {
            char c=sc.next().charAt(0);
            System.out.print("frequency of "+c+" is:"+hash[c]);
            q--;
        }
    }
}
/*
OUTPUT:
Enter string:abacAbAB
Enter no. of queries:3
a
frequency of a is:2
A
frequency of A is:2
B
frequency of B is:1 
*/