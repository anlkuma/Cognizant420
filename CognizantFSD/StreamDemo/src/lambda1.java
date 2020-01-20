import java.io.FileInputStream;  
public class lambda1 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("E:\\testout1.txt");    
            //byte[] bs = new byte[4];
            String s = "";
            int i=fin.rea
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }
}  