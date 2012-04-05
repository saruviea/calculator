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
	public void add_빈문자열_반환0() throws Exception{
		assertThat(cal.add(""), is(0));
	}
	
	@Test
	public void add_한개숫자_해당숫자반환() throws Exception{
		assertThat(cal.add("7"), is(7));
	}
	
	@Test
	public void add_두개숫자_구분자쉽표_합반환() throws Exception{
		assertThat(cal.add("1,2"), is(3));
	}
	
	@Test
	public void add_세개숫자_() throws Exception{
		assertThat(cal.add("7"), is(7));
	}
	
	@Test
	public void add_여러개숫자_구분자NewLine() throws Exception{
		assertThat(cal.add("1,2\n3"), is(6));
	}
	
	@Test
	public void add_구분자만들어서() throws Exception{
		assertThat(cal.add("//;\n1,2,3"), is(6));
	}
	
	@Test 
	public void add_런타임() throws Exception{
		cal.add("-1,2,3");
/*		try{
			cal.add("-1,2,3");
			fail("RuntimeException이 발생한다.");
		}
		catch(RuntimeException e){
			
		}
*/	}
}
