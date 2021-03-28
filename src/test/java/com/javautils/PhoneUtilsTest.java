package com.javautils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.javautils.utils.PhoneUtils;

@SpringBootTest
public class PhoneUtilsTest {
	@Test
	public void test() {
		Boolean isChinaHongKong = PhoneUtils.isChinaHongKong("81234123");
		Boolean isChinaMainland = PhoneUtils.isChinaMainland("18221234123");
		Boolean isChinaMainlandOrHongKong = PhoneUtils.isChinaMainlandOrHongKong("13712341234");
		System.out.println("isChinaHongKong:" + isChinaHongKong);
		System.out.println("isChinaMainland:" + isChinaMainland);
		System.out.println("isChinaMainlandOrHongKong:" + isChinaMainlandOrHongKong);
	}
}
