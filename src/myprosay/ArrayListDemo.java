package myprosay;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>();
       list.add("abc");
       list.add("rbc");
       list.add("ajc");
       list.add("ajc");
       list.add("abc");
       list.add("abk");
       /*for (int i=0; i<list.size(); i++){
    	   if ("ajc".equals(list.get(i))){
    		   list.remove(i);
    	   }    	   
       }*/
       /**
        * 在集合遍历过程中，进行删除操作，应该用倒序遍历删除；如果用顺序遍历删除，当要删除的元素相邻时，
        * 后一个元素是无法删除的，因为在删除前一个元素时，后面一个元素的位置已经往前挪一位了，下次再遍历
        * 到的元素已经是后一个元素的下一个元素了，即跳过了后面这个要删除的元素，所以无法删除
        */
       for (int i=list.size()-1; i>=0; i--){
    	   if ("ajc".equals(list.get(i))){
    		   list.remove(i);
    	   }    	  
       }      
    	   System.out.println(list.toString());
  
	}
}
