import java.util.*;
 public class Main
{
    public static void main(String []s)
    {
        int num,x,y;
       
        Scanner sc=new Scanner(System.in);
         
        System.out.print(" ");
        num=sc.nextInt();
      
        x= sc.nextInt();
        y= num+x;
   
        if(y>0)
        
            System.out.println(y + " POSITIVE ");
        else if(y<0)
            System.out.println(y + "  NEGATIVE ");
        else
            System.out.println("It's Zero");
         
    }
}
   