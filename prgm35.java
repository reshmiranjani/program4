import java.io.*;
import java.util.*;
 public class Main
 {
     public static void main(String args[])
     {
         String a;
         int count=0;
         Scanner sc=new Scanner(System.in);
         a=sc.nextLine();
         char n[]=a.toCharArray();
         for( int i=0;i<n.length;i++)
         {
             if(n[i]>='0'&&n[i]<='9')
             {
                 count++;
             }
         }
         System.out.print(count);
     }
 }
