import java.util.*;
public class CharacterHashing {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter string:");
       String s=sc.nextLine();
       int hash[]=new int[123];
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        hash[ch]++;
       }
       System.out.print("Enter no. of queries:");
       int q=sc.nextInt();
       while(q>0)
       {
         char c=sc.next().charAt(0);
         System.out.println("Frequency of "+c+" is:"+hash[c]);
         q--;
       }
    }
}
/*OUTPUT:
Enter string:abcaB
Enter no. of queries:3
a
Frequency of a is:2
b
Frequency of b is:1
B
Frequency of B is:1 
*/
