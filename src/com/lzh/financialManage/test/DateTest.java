package com.lzh.financialManage.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void testDate() {

//		System.out.println(new Date());
		// ��ʽ 24Сʱ�ƣ�2016-07-06 09:39:58
		Date dt = new Date();
		String formatDate = null;
		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd"); // HH��ʾ24Сʱ�ƣ�
		formatDate = dFormat.format(dt);
		System.out.println(formatDate);
	}

	@Test
	public void testDate2() {
		Date dt = new Date();
		System.out.println(dt); // ��ʽ�� Wed Jul 06 09:28:19 CST 2016

		// ��ʽ��2016-7-6
		String formatDate = null;
		formatDate = DateFormat.getDateInstance().format(dt);
		System.out.println(formatDate);

		// ��ʽ��2016��7��6�� ������
		formatDate = DateFormat.getDateInstance(DateFormat.FULL).format(dt);
		System.out.println(formatDate);

		// ��ʽ 24Сʱ�ƣ�2016-07-06 09:39:58
		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH��ʾ24Сʱ�ƣ�
		formatDate = dFormat.format(dt);
		System.out.println(formatDate);

		// ��ʽ12Сʱ�ƣ�2016-07-06 09:42:44
		DateFormat dFormat12 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // hh��ʾ12Сʱ�ƣ�
		formatDate = dFormat12.format(dt);
		System.out.println(formatDate);

		// ��ʽȥ���ָ���24Сʱ�ƣ�20160706094533
		DateFormat dFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");
		formatDate = dFormat3.format(dt);
		System.out.println(formatDate);

		// ��ʽת��long�ͣ�1467770970
		long lTime = dt.getTime() / 1000;
		System.out.println(lTime);

		// ��ʽlong��ת��Date�ͣ���ת��String�� 1464710394 -> ltime2*1000 -> 2016-05-31
		// 23:59:54
		long ltime2 = 1464710394;
		SimpleDateFormat lsdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date lDate = new Date(ltime2 * 1000);
		String lStrDate = lsdFormat.format(lDate);
		System.out.println(lStrDate);

		// ��ʽString��ת��Date�ͣ�2016-07-06 10:17:48 -> Wed Jul 06 10:17:48 CST 2016
		String strDate = "2016-07-06 10:17:48";
		SimpleDateFormat lsdStrFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		try {
			Date strD = lsdStrFormat.parse(strDate);
			System.out.println(strD);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}