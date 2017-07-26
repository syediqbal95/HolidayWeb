package com.mobilelive.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.mobilelive.holiday.HolidayApiClientTemp;



public class status2Test {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp client = new HolidayApiClientTemp("5a476967f-b632-4f35-897b-d7e7562910c0");
		@SuppressWarnings("unused")
		Object holidayJson = client.getHolidays("PK", 2016,12,-1);
		assertEquals(401,client.getHolidayJson2().getStatus());

	}

}
