package myprosay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 
 * 被关键字 transient 或是 static 修饰的成员变量不能被序列化,这是规则
 */
public class SerializableDemo {
	public static void main(String[] args) throws Exception {
		Student stu = new Student("songjianming", 29);		
		File f =new File("D:\\big.bin");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu);
		oos.write(stu.age);

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st = (Student) ois.readObject();
		System.out.println(st.name + "===============" + st.age);
	}
}

class Student implements Serializable {
	String name;
	int age;

	public Student(String name, int age) {
		System.out.println("进入构造方法!");
		this.name = name;
		this.age = age;
	}

}