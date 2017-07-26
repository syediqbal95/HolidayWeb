package com.mobilelive.holiday;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import com.mobilelive.custom.Holiday;


public class HolidayMain2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp client = new HolidayApiClientTemp("32256183-b02a-41d9-9b0a-53d63d8b49e9");
		Object holidayJson = client.getHolidays("PK",2016,12,25);
		if(holidayJson instanceof List){
			List<Holiday> holidays = (List<Holiday>)holidayJson;
			System.out.println(holidays.size());
			StringBuilder sb = new StringBuilder();
			for(Holiday holiday : holidays){
				sb.append(holiday.toString()).toString();
			}
			System.out.println(sb.append("\nstatus: ").append(client.getHolidayJson().getStatus()));
		}
		else{
			System.out.println(client.getHolidayJson2().getStatus());
		}
		
		
		
//		for(Holiday holiday : holidayJson){
//			System.out.println("Name: " + holiday.getName());
//			System.out.println("Date: " + holiday.getDate());
//			System.out.println("Observed: " + holiday.getObserved());
//			System.out.println("Public: " + holiday.isPublic());
//			System.out.println("");
//		}
	}

}
