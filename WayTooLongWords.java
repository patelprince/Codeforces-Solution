import java.util.Scanner;
class Telusko
{
	public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    String s[]=new String[n];
	int length;
	String str;
        
    for(int i=0; i<n; i++)
	{
		s[i]=sc.next();		
	}
	
	for(int i=0; i<n; i++)
	{
		if((s[i].length())>10)
		{
			str=s[i];
			length=s[i].length();
            System.out.println(str.substring(0,1) +(length-2)+ str.substring(length-1));
	    }
		else
			System.out.println(s[i]);
	}
	
  }  
}