package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void add_빈문자열_반환0() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("");
		assertThat(result, is(0));
	}
	
	@Test
	public void add_숫자하나_해당숫자반환() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("7");
		assertThat(result, is(7));
	}
	
	@Test
	public void add_숫자두개_숫자합반환() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2");
		assertThat(result, is(3));
	}
	
	@Test
	public void add_숫자세개_숫자합변환() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2,3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_구분자_NewLine포함() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2\n3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_커스텀구분자_지정() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("//;\n1;2;3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_예약어_구분자사용() throws  Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("//.\n1.2.3");
		assertThat(result, is(6));
	}
	
/*	@Test
	public void add_음수전달_예외발생() throws  Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("-1,2,3");

	}
*/
}
