import java.util.Scanner;

public class arrayElementRevrse 
{
    public static void main(String[] args) 
    {
        int a[]=new int [20];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array element in reverse order:");
        n-=1;
        for(int i=n;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        s.close();
    }
    
}
