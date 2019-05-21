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
       char str1[]=str.toCharArray();
        str = str.replaceAll("\\s", ""); 
       for(int i=0;i<str1.length;i++)
    {
        if(str1[i]==' ')
        {
            count++;
        }
    }
    System.out.println(count);
} 
 }
