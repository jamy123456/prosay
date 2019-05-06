package myprosay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//将一个文件中的内容复制到另一个文件中，通过字节流复制一切文件内容，而字符流只能复制纯文本内容;
public class FileDemo {
	public static void main(String[] args) throws IOException {	 
       File f = new File("d:/1.txt");
       File f1 = new File("d:/2.txt");
       FileInputStream fis = new FileInputStream(f);
       FileOutputStream fos = new FileOutputStream(f1);
       byte[] b = new byte[(int) f.length()];
       fis.read(b);
       fos.write(b);
       fos.close();
       fis.close();
       
       
      
      
      
    	   
       
      
       
       
	} 
}
