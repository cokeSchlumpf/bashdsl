package com.wellnr;

import org.junit.Test;

import com.wellnr.generator.StringUtil;

public class StringUtilTest {

	@Test
	public void test() {
		StringUtil s = new StringUtil();
		System.out.println(s.trimLines("     Hallo\n\n     sadasd"));
	}
	
}
