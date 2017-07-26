package com.mobilelive.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.mobilelive.holiday.HolidayApiClientTemp;



public class status1Test {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp client = new HolidayApiClientTemp("5476967f-b632-4f35-897b-d7e7562910c0");
		@SuppressWarnings("unused")
		Object holidayJson = client.getHolidays("CAA", 2016 ,12,-1);
		assertEquals(400,client.getHolidayJson2().getStatus());

	}

}
