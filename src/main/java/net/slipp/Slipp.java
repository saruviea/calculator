package net.slipp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Slipp {
	public int add(String text){
		if(text.isEmpty()){
			return 0;
		}
		if(text.startsWith("//")){
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
			m.find();
			
			String customDelimeter = m.group(1);
			return sum(m.group(2), customDelimeter);
		}
			return sum(text, ",|\n");
	}

	private int sum(String text, String delimeter) {
		String[] tokens = text.split(",|\n");
		int sum = 0;
		for(int i = 0; i < tokens.length; i++){
			sum += Integer.parseInt(tokens[i]);
		}
		return sum;
	}
	
	

}
