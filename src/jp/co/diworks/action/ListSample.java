package jp.co.diworks.action;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		//値の取得
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		//拡張for文
		for (String s : list) {
			System.out.println(s);
		}

	}

}
