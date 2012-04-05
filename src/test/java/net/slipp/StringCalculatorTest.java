package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void add_���ڿ�_��ȯ0() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("");
		assertThat(result, is(0));
	}
	
	@Test
	public void add_�����ϳ�_�ش���ڹ�ȯ() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("7");
		assertThat(result, is(7));
	}
	
	@Test
	public void add_���ڵΰ�_�����չ�ȯ() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2");
		assertThat(result, is(3));
	}
	
	@Test
	public void add_���ڼ���_�����պ�ȯ() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2,3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_������_NewLine����() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("1,2\n3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_Ŀ���ұ�����_����() throws Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("//;\n1;2;3");
		assertThat(result, is(6));
	}
	
	@Test
	public void add_�����_�����ڻ��() throws  Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("//.\n1.2.3");
		assertThat(result, is(6));
	}
	
/*	@Test
	public void add_��������_���ܹ߻�() throws  Exception{
		StringCalculator cal = new StringCalculator();
		int result = cal.add("-1,2,3");

	}
*/
}
