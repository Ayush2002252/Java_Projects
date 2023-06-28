
package college;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.*;
public class PreProcessor 
{
    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("01d_test1.c")));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("my.h")));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("my1.h")));

        String line;
        String line1="";
        String line2="";
        while((line=br.readLine())!=null)
        {
            if(line.startsWith("#include"))
            {
                while((line1=br1.readLine())!=null)
                {
                    line=line+line1;
                    line=line+"\n"; 
                    line=line.replace("#include \"my.h\"","");
                    
                    if(line.startsWith("#include"))
                    {      
                        while((line2=br2.readLine())!=null)
                        {
                            line=line+line2;
                            line=line+"\n";
                            line=line.replace("#include \"my1.h\"","");
			     if(line.startsWith("#include"))
                             {      
                                while((line2=br2.readLine())!=null)
                                 {
                                    line=line+line2;
                                    line=line+"\n";
                                    line=line.replace("#include \"my1.h\"","");
                                 }
                        }
                    }
                }    
	
           
            if(line.contains("/*"))
            {
                while(!line.contains("*/"))
                {
                    line=br.readLine();
                }
                line=br.readLine();
            }
            if(line.contains("//"))
            {
                while(!line.contains("/n"))
                {
                    line=br.readLine();
                }
                line=br.readLine();   
            }
            if(line.length()!=0)
            {
                line=line.replaceAll("\\s{2,}"," ").trim();
                 System.out.println(line);  
            }
        }    
    }       
}    
   



