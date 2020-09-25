import java.util.Scanner;
public class WordCapitalization
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String str;
       str=s.substring(0,1);
     
       System.out.println( str.toUpperCase()+s.substring(1));
    }
}