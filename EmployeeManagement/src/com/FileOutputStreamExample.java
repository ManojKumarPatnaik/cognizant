package com;
import java.io.FileInputStream;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("E:\\test.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes();    
             fout.write(b);    
             fout.close();    
             System.out.println("success");    
            }catch(Exception e){System.out.println(e);} 
           try{    
               FileInputStream fin=new FileInputStream("E:\\test.txt");    
               int i=0;    
               while((i=fin.read())!=-1){    
                System.out.print((char)i);    
               }    
               fin.close();    
             }catch(Exception e){System.out.println(e);
      }    
    }
}
  
