package myprosay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//利用字符缓冲流读取文件中的内容
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException,
			InterruptedException {
		// 创建一个文件对象
		File f1 = new File("D:/1.txt");
		// 创建一个文件字符流相当于输送小管道
		FileReader fr = new FileReader(f1);
		// 创建一个字符缓冲流，相当于是套在小管道外面的大管道
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		// 按行读取文件中的内容
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			// 中间间隔2秒钟输出一次
			Thread.sleep(2000);
		}
	}
}
