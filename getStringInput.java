import java.util.Scanner;

class getStringInput
{
    public static void main(String [] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(s);
        sc.close();        
    }
}