public class Palindrome {
   boolean isPalindrome(String s,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
    public static void main(String args[])
    {
        Palindrome p=new Palindrome();
        String s="level";
    
        if(p.isPalindrome(s,0,s.length()-1)){
            System.out.print("The string is Palindrome");
        }
        else{
            System.out.print("The string is not a palindrome");
        }
    }
}
/*
OUTPUT:
The string is Palindrome
*/
