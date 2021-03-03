/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.model;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Table implements schoolJson{

    private int id;
    private ArrayList<Lecture> lectures = new ArrayList<>();
    private SClass sClass;
    public static AtomicInteger counter = new AtomicInteger(1);

    public Table(int id, ArrayList<Lecture> lectures, SClass sClass) {
        this.id = id;
        this.lectures = lectures;
        this.sClass = sClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        counter.incrementAndGet();
        this.id = id;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public SClass getsClass() {
        return sClass;
    }

    public void setsClass(SClass sClass) {
        this.sClass = sClass;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", getId());
        object.put("Lecture", getLectures());
        object.put("sClass", getsClass());
        return object;
    }

    @Override
    public schoolJson fromJson(JSONObject object) {
        object.put("id", 5);
        object.put("Lecture", lectures);
        object.put("sClass", sClass);
        return null;
    }

}

