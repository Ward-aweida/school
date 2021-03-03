/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.model;


import org.json.simple.JSONObject;

import java.util.Date;

public class Instructor extends Person implements schoolJson {


    private Lecture lecture;


    public Instructor(int id, String name, Date dateOfBarthe, Gender gender, Lecture lectures) {
        super(id, name, dateOfBarthe, gender);
        this.lecture = lectures;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }


    public JSONObject toJson() {
        JSONObject object = super.toJson();
        object.put("Lecture", lecture.toJson());
        return object;
    }

    public schoolJson fromJson(JSONObject object) {
        object = (JSONObject) super.fromJson(object);
        object.get("Lecture");
        return fromJson(object);
    }
}


