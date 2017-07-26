package com.mobilelive.custom;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Jason on 29/06/2017.
 */
public class HolidayJson{

    private int status;
    @JsonProperty(value = "holidays")
    private List<Holiday> holidays;

    public HolidayJson() {
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

   }
