package school.model;

import org.json.simple.JSONObject;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Person implements schoolJson {

    private int id;
    private String name;
    private Date dateOfBarth;
    private Gender gender;
    public static AtomicInteger counter = new AtomicInteger(1);


    public enum Gender {
        Male, Female
    }


    public Person(int id, String name, Date dateOfBarthe, Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBarth = dateOfBarthe;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }


    public Date getDateOfBarth() {
        return dateOfBarth;
    }


    public int setId(int id) {
        counter.incrementAndGet();
        this.id = id;
        return id;
    }


    public String setName(String name) {
        this.name = name;
        return name;
    }


    public Date setDateOfBarthe(Date dateOfBarthe) {
        this.dateOfBarth = dateOfBarthe;
        return dateOfBarthe;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;

    }




    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("datofbarth", dateOfBarth.toString());
        object.put("Gender", gender);
        return object;
    }

    public schoolJson fromJson(JSONObject object) {
        object.get("id");
        object.get("name");
        object.get("datofbarth");
        object.get("Gender");
        return null;

    }


}
