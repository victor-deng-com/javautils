package com.javautils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.javautils.utils.StringUtils;

@SpringBootTest
public class StringUtilsTest {

	@Test
	public void test() {
		System.out.println("null:"+StringUtils.isEmpty(null));
		System.out.println("\"\":"+StringUtils.isEmpty(""));
		System.out.println("空格:"+StringUtils.isEmpty(" "));
		System.out.println("多个空格:"+StringUtils.isEmpty("   "));
		//isNotEmpty=!isEmpty
		System.out.println("不为空:"+StringUtils.isNotEmpty("123"));
	}
}
