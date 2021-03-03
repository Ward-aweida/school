
package school.model.constance;


import org.json.simple.JSONObject;
import school.model.Person;

import java.time.LocalTime;


public class Period {


    public Period(Time time) {
        this.time = time;
    }

    public Period(Day day, Time time) {
        this.day = day;
        this.time = time;
    }


    public Period(Day day) {
        this.day = day;
    }


    public Day getDay() {
        return day;
    }


    public Time getTime() {
        return time;
    }


    public Day setDay(Day day) {
        this.day = day;
        return day;
    }


    public Time setTime(Time time) {
        this.time = time;
        return time;
    }


    private Day day;
    private Time time;

    public enum Day {

        SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }


    public enum Time {
        FIRST, Second, Thered, Fourth, Fiveth, Sixth, Seventh;


        public LocalTime startTime(Period period) {

            return (LocalTime.of(8, 0).plusMinutes((period.time.ordinal()) * 45));
        }

    }
    public void toJson(){
        JSONObject obj = new JSONObject();
        obj.put("Day",getDay());
        obj.put("Time", getTime());

    }
    public void fromJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.get("Day");
        jsonObject.get("Time");

    }
}
