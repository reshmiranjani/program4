import java.io.*;
import java.util.*;
 public class Main
 { 
    public static void main(String[] args) 
    { 
         String str;
         int count=0;
         Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
       char b[]=str.toCharArray();
        str = str.replaceAll("\\s", ""); 
       for(int i=0;i<b.length;i++)
    {
        if(b[i]==' ')
        {
            count++;
        }
    }
    System.out.println(count);
} 
 }
