public class ReplaceAllExample 
{
    public static void main(String args[]){ 
        String s1="My name is Lalit. My name is Thakre. My name is ThakreLalit."; 
        String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was" 
        System.out.println(replaceString); 
        }
        
    
}
