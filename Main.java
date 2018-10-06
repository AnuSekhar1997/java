import java.util.*;
 public class Main
{
    public static void main(String []s)
    {
        int num;
       
        Scanner sc=new Scanner(System.in);
         
        num=sc.nextInt();
        if(num>0){
        
            System.out.println(num+ " POSITIVE ");
                }
        else if(num<0)
              {
            System.out.println(num+ "  NEGATIVE ");
              }
        else
               {
            System.out.println("It's Zero");
             }
         
    }
}
   