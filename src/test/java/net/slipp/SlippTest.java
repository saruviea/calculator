package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SlippTest {
	private Slipp cal;
	@Before
	public void setup(){
		cal = new Slipp();
	}
	
	@Test
	public void add_���ڿ�_��ȯ0() throws Exception{
		assertThat(cal.add(""), is(0));
	}
	
	@Test
	public void add_�Ѱ�����_�ش���ڹ�ȯ() throws Exception{
		assertThat(cal.add("7"), is(7));
	}
	
	@Test
	public void add_�ΰ�����_�����ڽ�ǥ_�չ�ȯ() throws Exception{
		assertThat(cal.add("1,2"), is(3));
	}
	
	@Test
	public void add_��������_() throws Exception{
		assertThat(cal.add("7"), is(7));
	}
	
	@Test
	public void add_����������_������NewLine() throws Exception{
		assertThat(cal.add("1,2\n3"), is(6));
	}
	
	@Test
	public void add_�����ڸ���() throws Exception{
		assertThat(cal.add("//;\n1,2,3"), is(6));
	}
	
	@Test 
	public void add_��Ÿ��() throws Exception{
		cal.add("-1,2,3");
/*		try{
			cal.add("-1,2,3");
			fail("RuntimeException�� �߻��Ѵ�.");
		}
		catch(RuntimeException e){
			
		}
*/	}
}
