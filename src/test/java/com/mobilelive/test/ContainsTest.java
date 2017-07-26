package com.mobilelive.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobilelive.custom.Holiday;
import com.mobilelive.holiday.HolidayApiClientTemp;





public class ContainsTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp clientTemp = new HolidayApiClientTemp("5476967f-b632-4f35-897b-d7e7562910c0");
		Object holidayJson = clientTemp.getHolidays("PK", 2016,12,-1);
		
		@SuppressWarnings("unchecked")
		List<Holiday> holidays = (List<Holiday>)holidayJson;
		StringBuilder sb = new StringBuilder();
		for(Holiday holiday : holidays){
			sb.append(holiday.toString());
		}
		String result = sb.toString();
		String name =  "name";
		String observed =  "observed";
		String date =  "date";
		String Public =  "public";
		
		assert(result.contains(name));
		assert(result.contains(observed));
		assert(result.contains(date));
		assert(result.contains(Public));
	
	}

}
