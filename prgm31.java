import java.io.*;
import java.util.*;
 public class Main
 { 
    public static void main(String[] args) 
    { 
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        String n=a.replaceAll(" ","");
        int len=n.length();
        System.out.print(len);
} 
 }
