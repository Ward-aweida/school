package school.model;

import org.json.simple.JSONObject;
import school.model.constance.Period;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wa3
 */
public class Lecture implements schoolJson {

    private int id;
    private String name;
    private Book book;
    private Period periods;

    public static AtomicInteger counter = new AtomicInteger(1);

    public Lecture(int id, String name, Book book, Period periods) {
        this.id = id;
        this.name = name;
        this.book = book;
        this.periods = periods;
    }

    public String Lecture(int[] Arrays) {
        return ("number of lacture" + book);

    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Book getBook() {
        return book;
    }

    public Period getPeriods(Period periods) {
        return periods;
    }

    public void setPeriods(Period periods) {
        this.periods = periods;
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


    public Object setBooks(Book book) {
        this.book = book;
        return book;
    }


    @Override
    public JSONObject toJson() {

        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("Book", book.toJson());
        object.put("period", periods);
        return object;
    }

    @Override
    public schoolJson fromJson(JSONObject jsonObject) {
        return (schoolJson) (jsonObject);
    }
}
