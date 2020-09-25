import java.util.Scanner;
public class PetyaAndString
{
    public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  String s1=sc.next();
	  String s2=sc.next();
	  int x=s1.compareToIgnoreCase(s2);
	  if(x==0)
		  System.out.println("0");
	  else if(x>0)
		   System.out.println("1");
	  else
		    System.out.println("-1");
	
	}
}