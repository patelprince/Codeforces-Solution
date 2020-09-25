import java.util.Scanner;
import java.util.HashSet;
public class BoyOrGirl
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       char c;
	   String str;
	   HashSet<String> hs=new HashSet<String>();
	   for(int i=0; i<s.length(); i++)
	   {
		  c=s.charAt(i);
		  str=String.valueOf(c);
		  hs.add(str); 
	   }
      int length;
	  length=hs.size();
	   if(length%2==0)
       System.out.println("CHAT WITH HER!");
       else
       System.out.println("IGNORE HIM!");  
	  
	}
}