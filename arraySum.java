import java.util.Scanner;

public class arraySum 
{
    public static void main(String [] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int a=s.nextInt();
            sum+=a;
        }
        System.out.println(sum);
        s.close();        
    }    
}
