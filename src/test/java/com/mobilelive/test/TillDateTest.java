package com.mobilelive.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.mobilelive.custom.Holiday;
import com.mobilelive.holiday.HolidayApiClientTemp;



public class TillDateTest {
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp client = new HolidayApiClientTemp("5476967f-b632-4f35-897b-d7e7562910c0");
		Object holidayJson = client.getHolidays("PK", 2016, 12, 01);
		@SuppressWarnings("unchecked")
		List<Holiday> holidays = (List<Holiday>)holidayJson;
		StringBuilder sb = new StringBuilder();
		for (Holiday holiday : holidays) {
			sb.append(holiday.toString());
		}
		String result = sb.toString();
		String expect = "\n\nname: Birthday of Nabi" + "\ndate: 2016-12-01" + "\nobserved: 2016-12-01" + "\npublic: true";
		assertEquals(expect, result);

	}
}
