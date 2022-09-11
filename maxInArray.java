import java.util.Scanner;

public class maxInArray 
{
    public static void main(String [] args) 
    {
        int a[]=new int [20];   
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=s.nextInt();
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum in an array is:"+max);
        s.close();
    }    
}
