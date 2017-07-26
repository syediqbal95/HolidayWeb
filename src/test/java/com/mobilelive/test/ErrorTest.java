package com.mobilelive.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobilelive.custom.HolidayJson2;

import com.mobilelive.holiday.HolidayApiClientTemp;



public class ErrorTest {
	
	HolidayApiClientTemp holiday;
	Object holidayJson;
	
	@Before
	public void setup() throws JsonParseException, JsonMappingException, IOException{
		holiday = mock(HolidayApiClientTemp.class);
	
		holiday.setApiKey("35476967f-b632-4f35-897b-d7e7562910c0");
		holidayJson = holiday.getHolidays("CA", 2018, 12, -1);
		when(holiday.getHolidayJson2()).thenReturn(new HolidayJson2(500, "failure error message!"));
	}
	
	@Test
	public void test() {
		assertEquals(500,holiday.getHolidayJson2().getStatus());
	}

}
