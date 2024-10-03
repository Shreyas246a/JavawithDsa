package com.java.strings;

import java.util.HashMap;

public class Stringtrans {

	
	static Boolean transformStr(String s,String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		HashMap<Character, Character>sAT=new HashMap<Character, Character>();	
		HashMap<Character, Character>tAS=new HashMap<Character, Character>();	
		
		for(int i=0;i<s.length();i++) {
			char ss=s.charAt(i);
			char tt=t.charAt(i);
			
			if(sAT.containsKey(ss)) {
				if(sAT.get(ss)!=tt) {
					return false;
				}
			}
			else {
				tAS.put(ss, tt);
			}
			
			if(tAS.containsKey(tt)) {
				if(tAS.get(tt)!= ss) {
					return false;
				}
			}
			else {
				tAS.put(tt, ss);
			}	
				
		}
				
		return true;
	}
	
	
	public static void main(String[] args) {
		
		    String s = "moo";
	        String t = "kgg";
	        System.out.println(transformStr(s, t));
		

	}

}
