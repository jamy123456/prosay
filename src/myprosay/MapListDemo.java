package myprosay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author jamy Map和List的嵌套使用 Map和List集合都重写了toString方法 所以打印出来的效果是这样的： [{song=15,
 *         jamy=12, kevin=11, son=19, rebert=32, andy=22}] {list=[{song=15,
 *         jamy=12, kevin=11, son=19, rebert=32, andy=22}]}
 *
 */
public class MapListDemo {
	public static void main(String[] args) {
		//
		Map<String, String> map = new HashMap<String, String>();
		map.put("jamy", "12");
		map.put("andy", "22");
		map.put("song", "15");
		map.put("kevin", "11");
		map.put("son", "19");
		map.put("tom", "17");
		map.put("rebert", "32");
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		list.add(map);
		System.out.println(list);
		Map<String, Object> body = new HashMap<>();
		body.put("list", list);
		System.out.println(body);
	}
}
