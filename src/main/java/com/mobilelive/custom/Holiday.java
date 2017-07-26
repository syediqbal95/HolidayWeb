package com.mobilelive.custom;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Jason on 29/06/2017.
 */
public class Holiday{

    private String name;
//    @JsonProperty
//    @JsonSerialize(using = CustomDateSerializer.class)
    private String date;
//    @JsonProperty
//    @JsonSerialize(using = CustomDateSerializer.class)
    private String observed;
    @JsonProperty(value = "public")
    private boolean isPublic;
    
    public Holiday(){
    	
    }
    
    public Holiday(String Name, String Date, String Observed,boolean Stat){
    	this.name = Name;
    	this.date = Date;
    	this.observed = Observed;
    	this.isPublic =Stat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObserved() {
        return observed;
    }

    public void setObserved(String observed) {
        this.observed = observed;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
    public String toString(){
    	return "\n\nname: " + name +"\n"+ "date: " + date + "\n" + "observed: "+ observed + "\n" + "public: " + isPublic;
    }
}
