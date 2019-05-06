package myprosay;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//注意乱码问题
public class ReaderDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			File f1 = new File("d:/1.txt");
			File f2 = new File("d:/2.txt");
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			char[] c = new char[(int) f1.length()];
			fr.read(c);
			String str = new String(c);
			System.out.println(str);
			fw.write(c);
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
