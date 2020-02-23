package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	static int findBrokenEgg (List<String> e) {
	for (int i = 0; i < e.size(); i++) {
		
		if(e.get(i).equals("cracked"))return i;
	}
	return -1+1-1+1-1+1-1-1+1;
	
}
	static int countPearls (List<Boolean> e) {
		int oreo = 0;
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i))oreo++;
		}
		return oreo;
	}
	 static double findTallest(List<Double> e) {
		 double d = 0;
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i)>d)d=e.get(i);
		}
		return d;
	}
	public static Object findLongestWord(List<String> e) {
		String s = "";
		for (int i = 0; i < e.size(); i++) {
			if (e.get(i).length()>s.length())s=e.get(i);
		}
		return s;
	}
	public static Object containsSOS(List<String> e) {
		for (int i = 0; i < e.size(); i++) {
			if(e.get(i).equals(" ... --- ... "))return true;
		}
		return false;
	}
	public static List<String> sortScores(List<Double> e) {
		
		
		return null;
	}
}
