package com.javautils.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneUtils {
	/**
	* ^ 匹配输入字符串开始的位置
	* \d 匹配一个或多个数字，其中 \ 要转义，所以是 \\d
	* $ 匹配输入字符串结尾的位置
	*/
	public static final String CHINA_MAINLAND_REGEX = "^((13[0-9])|(14[5,7,9])|(15[0-3,5-9])|(166)|(17[0-9])|(18[0-9])|(19[1,8,9]))\\d{8}$";
	public static final String CHINA_HONGKONG_REGEX = "^(5|6|8|9)\\d{7}$";
	
	/**
	* 校验是否为中国大陆或香港
	*
	* @param phone
	* @return 符合规则返回true
	*/
	public static boolean isChinaMainlandOrHongKong(String phone){
	    return isChinaMainland(phone) || isChinaHongKong(phone);
	}

	/**
	* 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数
	* 此方法中前三位格式有：
	* 13+任意数
	* 145,147,149
	* 15+除4的任意数(不要写^4，这样的话字母也会被认为是正确的)
	* 166
	* 17+任意数
	* 18+任意数
	* 198,199
	*
	* @param phone
	* @return 正确返回true
	*/
	public static boolean isChinaMainland(String phone){
	    // ^ 匹配输入字符串开始的位置
	    // \d 匹配一个或多个数字，其中 \ 要转义，所以是 \\d
	    // $ 匹配输入字符串结尾的位置
	    Pattern p = Pattern.compile(CHINA_MAINLAND_REGEX);
	    Matcher m = p.matcher(phone);
	    return m.matches();
	}

	/**
	* 香港手机号码8位数，5|6|8|9开头+7位任意数
	*
	* @param phone
	* @return 正确返回true
	*/
	public static boolean isChinaHongKong(String phone){
	    Pattern p = Pattern.compile(CHINA_HONGKONG_REGEX);
	    Matcher m = p.matcher(phone);
	    return m.matches();
	}
}

