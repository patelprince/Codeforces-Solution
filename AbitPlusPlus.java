import java.util.Scanner;
public class AbitPlusPlus
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String[] s=new String[n];
	 int x=0;
	 for(int i=0; i<n; i++)
	 {
        s[i]=sc.next();
		String str;
		str=s[i];
		if(str.contains("x++"))
			x++;
		else if(str.contains("++x"))
			++x;
		else if(str.contains("x--"))
			x--;
		else
			--x;
     }
	System.out.println(x);
  }
}