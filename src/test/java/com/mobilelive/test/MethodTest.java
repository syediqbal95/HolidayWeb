/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobilelive.test;

import com.mobilelive.holidayweb.Application;
import com.mobilelive.holidayweb.Controllers.HolidayController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 *
 * @author syediqbal
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MethodTest {
    private MockMvc mockMvc;
    @Autowired
    HolidayController holidayController;
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(holidayController).build();
    }
    
    @Test
    public void testMethod() throws Exception{
        mockMvc.perform(delete("/holiday/getHolidayList?country=CA&year=2016&month=12&day=-1"))
                .andDo(print())
                .andExpect(status().isMethodNotAllowed())
                .andReturn();
        
         mockMvc.perform(post("/holiday/getHolidayList?country=CA&year=2016&month=12&day=-1"))
                .andDo(print())
                .andExpect(status().isMethodNotAllowed())
                .andReturn();
         
          mockMvc.perform(put("/holiday/getHolidayList?country=CA&year=2016&month=12&day=-1"))
                .andDo(print())
                .andExpect(status().isMethodNotAllowed())
                .andReturn();
               
    }
}
