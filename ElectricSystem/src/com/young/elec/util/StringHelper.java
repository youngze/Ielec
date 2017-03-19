package com.young.elec.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringHelper {

	/**
	 * 将String转化为Date类型
	 */
	public static Date stringConvertDate(String string_date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(string_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

}
