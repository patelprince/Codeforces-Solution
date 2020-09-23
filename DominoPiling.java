import java.util.Scanner;
public class DominoPiling
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int m=sc.nextInt();
	 int n=sc.nextInt();
	 int x=m*n;
	 int count=0;
	 for(int i=2; i<=x; i=i+2)
	 {
		if(i<=x)
		 {
			 count++;
		 }
	 }
	 System.out.print(count);
  }
}