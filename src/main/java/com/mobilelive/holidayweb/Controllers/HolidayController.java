/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobilelive.holidayweb.Controllers;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.mobilelive.custom.Holiday;
import com.mobilelive.custom.HttpResponse;
import com.mobilelive.holiday.HolidayApiClientTemp;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author syediqbal
 */
@RestController
@RequestMapping("/holiday")
public class HolidayController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    
    @RequestMapping(value="/getHolidayList",method=RequestMethod.GET)
    public Object getList(HttpServletRequest request,HttpServletResponse httpResponse) throws JsonMappingException, IOException{
        HolidayApiClientTemp client = new HolidayApiClientTemp("5476967f-b632-4f35-897b-d7e7562910c0");
                String country =request.getParameter("country");
                int year = Integer.valueOf(request.getParameter("year"));
                int month = Integer.valueOf(request.getParameter("month"));
                int day = Integer.valueOf(request.getParameter("day"));
		Object holidayJson = client.getHolidays(country,year,month,day);
                StringBuilder sb = new StringBuilder();
                HttpResponse response = new HttpResponse();
		if(holidayJson instanceof List){
			List<Holiday> holidays = (List<Holiday>)holidayJson;
                        response.setHolidays(holidays);
                        response.setStatus(client.getHolidayJson().getStatus());
                        response.setMessage("It WORKS!!!!!");
                        return response;
//                        sb.append("status: ").append(client.getHolidayJson().getStatus());
//			System.out.println(holidays.size());
//			
//			for(Holiday holiday : holidays){
//				sb.append(holiday.toString()).toString();
//			}
//			return sb;
		}
		else{
                        httpResponse.setStatus(client.getHolidayJson2().getStatus());
			response.setHolidays(null);
                        response.setStatus(client.getHolidayJson2().getStatus());
                        response.setMessage(client.getHolidayJson2().getError());
                        return response;
		}
    }
}
