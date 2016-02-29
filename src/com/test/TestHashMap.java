package com.test;

public class TestHashMap {

	public static void main(String[] args) {
		/*CustomHashMap<Integer, String> map = new CustomHashMap<Integer, String>();
		map.put(1, "First");
		map.put(2, "Third");
		map.remove(1);
		map.put(1, "Two");
		map.put(3, "Fifth");
		map.put(2, "Fourth");
		map.put(1, "Second");
		map.put(4, "Hundreth");
		map.put(5, "First");
		map.put(6, "Third");
		map.put(7, "Fifth");
		map.put(8, "Fourth");
		map.put(9, "Second");
		map.put(10, "Hundreth");
		map.put(11, "First");
		map.put(12, "Third");
		map.put(13, "Fifth");
		map.put(14, "Fourth");
		map.put(15, "Second");
		map.put(16, "Hundreth");
		map.put(17, "First");
		map.put(18, "Third");
		map.put(19, "Fifth");
		map.put(20, "Fourth");
		
		map.put(21, "Second");
		map.put(22, "Hundreth");
		map.put(23, "First");
		map.put(24, "Third");
		map.put(25, "Fifth");
		map.put(26, "Fourth");
		map.put(27, "Second");
		map.put(28, "Hundreth");
		map.put(29, "First");
		map.put(30, "Third");
		map.put(31, "Fifth");
		map.put(32, "Fourth");
		map.put(33, "Second");
		map.put(34, "Hundreth");
		map.put(35, "First");
		map.put(36, "Third");
		map.put(37, "Fifth");
		map.put(38, "Fourth");
		//map.remove(2);
		map.remove(1);
		map.remove(3);
		//map.remove(4);
		map.put(10, "Tenth");
		map.remove(10);
		System.out.println("Count: " + map.count);
		System.out.println("Threshold: " + map.threshold);
		System.out.println("Size: " + map.entries.length);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
		System.out.println(map.get(6));
		System.out.println(map.get(7));
		System.out.println(map.get(8));
		System.out.println(map.get(9));
		System.out.println(map.get(10));*/
		/*int threshold = (int)Math.min(32 * 0.75F, 1.073742E+009F);
		System.out.println(threshold);*/
		
		/*CustomHashMap<Integer, String> genMap = new CustomHashMap<Integer, String>();
		genMap.put(12, "WP");
		genMap.put(21, "12546");
		genMap.remove(12);
		genMap.remove(21);
		System.out.println(genMap.get(12));
		genMap.put(12, "RT");
		genMap.put(21, "23456");
		System.out.println(genMap.get(12));
		System.out.println(genMap.get(21));*/
		
		CustomHashMap<String, String> genMap = new CustomHashMap<String, String>();
		genMap.put("Name", "WP");
		genMap.put("Id", "12546");
		genMap.remove("Name");
		genMap.remove("Id");
		System.out.println(genMap.get("Name"));
		genMap.put("Name", "RT");
		genMap.put("Id", "23456");
		System.out.println(genMap.get("Name"));
		System.out.println(genMap.get("Id"));
		
		/*System.out.println(genMap.hash("Id"));
		System.out.println(genMap.hash("Name"));*/
	}

}
