import java.io.*;
 class lambda{
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		}
		catch(Exception e) {System.out.println(e+"\n\n");
	}
		
	

 
 
           try{    
             FileInputStream fin=new FileInputStream("E:\\testout.txt");    
             int i=fin.read();  
             System.out.print((char)i);    
   
             fin.close();    
           }catch(Exception e)
           {
        	   System.out.println(e);
           }    
          }    
         }  