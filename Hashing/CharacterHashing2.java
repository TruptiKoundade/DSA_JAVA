//for lowercase letters
import java.util.*;
public class CharacterHashing2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hash[ch-'a']++;
        }
        System.out.print("Enter no. of queries:");
        int q=sc.nextInt();
        while(q>0)
        {
          char c=sc.next().charAt(0);
          System.out.print("Frequency of "+c+" is:"+hash[c-'a']);
        }
    }
}
/*OUTPUT:
Enter the string:abcbcb
Enter no. of queries:3
a
Frequency of a is:1
b
Frequency of b is:3
c
Frequency of c is:2 
*/
