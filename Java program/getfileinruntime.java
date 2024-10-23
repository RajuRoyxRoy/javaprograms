import java.io.*;
import java.util.*;
public class getfileinruntime {
    public static void main (String args[])throws IOException
    {
        int nl=1,nw=0;
        char ch;
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("Enter file name or the class name: \n");
            String str=scr.nextLine();
            try (FileInputStream f = new
            FileInputStream(str)) {
                int n=f.available();
                for(int i=0;i<n;i++)
                {
                    ch=(char)f.read();
                    if(ch=='\n')
                    nl++;
                    else if(ch == ' ')
                    nw++;


                    
                }
            }
        }
        System.out.println("\nNumber of lines are:"+nl);
        System.out.println("\nNumber of words are:"+(nl+nw));
    }
}