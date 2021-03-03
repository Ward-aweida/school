/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.model;

import org.json.simple.JSONObject;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wa3
 */
public class Book implements schoolJson {

    private int id;
    private String name;
    private String autherName;
    private int nomberOfPages;
    private Date releaseYear;
    public static AtomicInteger counter = new AtomicInteger(1);


    public Book(int id, String name, String autherName, int nomberOfPages, Date releaseYear) {
        this.id = id;
        this.name = name;
        this.autherName = autherName;
        this.nomberOfPages = nomberOfPages;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getAutherName() {
        return autherName;
    }


    public int getNomberOfPages() {
        return nomberOfPages;
    }


    public Date getReleaseYear() {
        return releaseYear;
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


    public String setAutherName(String autherName) {
        this.autherName = autherName;
        return autherName;
    }


    public int setNomberOfPages(int nomberOfPages) {
        this.nomberOfPages = nomberOfPages;
        return nomberOfPages;
    }


    public Date setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
        return releaseYear;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("autherName", autherName);
        object.put("numberOfPages", nomberOfPages);
        object.put("releaseYear", releaseYear.toString());
        return object;

    }

    public schoolJson fromJson(JSONObject object) {

        object.get("id");
        object.get("name");
        object.get("autherName");
        object.get("numberOfPages");
        object.get("releaseYear");

        return null;
    }


}
