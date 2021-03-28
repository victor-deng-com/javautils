package com.javautils;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.javautils.utils.DateUtils;

@SpringBootTest
public class DateUtilsTest {
	@Test
	public void test() {
		Date date = DateUtils.getDate("Thu Feb 01 2021 00:00:00 GMT+0805 (中国标准时间)");
		System.out.println("date>>" + date);
		System.out.println("getZeroOfDay>>"+DateUtils.getZeroOfDay(date));
		System.out.println("getEndOfDay>>"+DateUtils.getEndOfDay(date));
		System.out.println("getFirstOfMonth>>"+DateUtils.getFirstOfMonth(date));
		System.out.println("getLastOfMonth>>"+DateUtils.getLastOfMonth(date));
	}
}
