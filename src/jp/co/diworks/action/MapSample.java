package jp.co.diworks.action;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		java.util.Map<String, String> map = new HashMap<String, String>();

		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");

		//値の取得
		String value = map.get("key1");
		System.out.println(value);

		//存在しないkeyの場合はnull
		String valueNull = map.get("key6");
		System.out.println(valueNull);

		//mapに該当するkeyが存在するか否かをチェックすることも可能
		if (map.containsKey("key1")) {
			System.out.println("key1は存在します");
		} else {
			System.out.println("key1は存在しません");
		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}

	}

}
