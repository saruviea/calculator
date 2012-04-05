package net.slipp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StringCalculator {
	public int add(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(text.isEmpty()){
			return 0;
		}
		if(text.contains(",")){			
			String[] numbers = text.split(",|\n");
			int sum = 0;
			for(int i=0; i<numbers.length; i++){
				sum += Integer.parseInt(numbers[i]);
				if(Integer.parseInt(numbers[i]) < 0){
					throw new RuntimeException("음수를 사용할 수 없습니다.");
				}
			}
			return sum;
		}	
		if(m.find()){
			String customDelimeter = m.group(1);
			String[] tokens = m.group(2).split(Pattern.quote(customDelimeter));
			int sum = 0;
			for(int i=0; i<tokens.length; i++){
				sum += Integer.parseInt(tokens[i]);
			}
			return sum;
		}		
		return Integer.parseInt(text);
	}
}
