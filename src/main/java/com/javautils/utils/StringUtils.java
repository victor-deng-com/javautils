package com.javautils.utils;

public class StringUtils {
	/**
	 * 判断字符串是否为空/空字符串/全是空格 str如果为空对象，或者空字符串，或者只有空格的字符串，均返回true，否则返回false
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean isEmpty(String str) {
		if (str == null || str.equals("") || str.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断字符串不为空 str不是空对象，不是空字符串，不全是空格组成的字符串，则返回true，否则返回false
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
}
