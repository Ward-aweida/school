
package school.model;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class SClass implements schoolJson{

    private int id;
    private int roomNumber;
    private Book books;
    private Instructor instructor;
    private Instructor classManeger;
    private ArrayList<Student> students = new ArrayList<>();
    private Student mangerAssistance;
    private int studentsMarks;
    private char Section;

    public static AtomicInteger counter = new AtomicInteger(1);

    public SClass(int id, int roomNumber, Book book, Instructor instructor, Instructor instructor1, ArrayList<Student> students, Student mangerAsstance, int studentsMarks, String s) {
    }

    enum Level {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        ELEVEN,
        TWELVE

    }

    public SClass(int id, int roomNumber, Book books, Instructor instructor, Instructor classManeger,
                  ArrayList<Student> students, Student mangerAssistance, int studentsMarks, char section) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.books = books;
        this.instructor = instructor;
        this.classManeger = classManeger;
        this.students = students;
        this.mangerAssistance = mangerAssistance;
        this.studentsMarks = studentsMarks;
        this.Section = section;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        counter.incrementAndGet();
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public Book getBooks() {
        return books;
    }


    public Instructor getClassManeger() {
        return classManeger;
    }


    public int setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return roomNumber;
    }


    public Book setBooks(Book books) {
        this.books = books;
        return books;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char section) {
        Section = section;
    }

    public ArrayList<Student> setStudents(ArrayList<Student> students) {
        this.students = students;
        return students;
    }

    public Instructor setClassManeger(Instructor classManeger) {
        this.classManeger = classManeger;
        return classManeger;
    }

    public Student getMangerAssistance() {
        return mangerAssistance;
    }

    public void setMangerAssistance(Student mangerAssistance) {
        this.mangerAssistance = mangerAssistance;
    }

    public int getStudentsMarks() {
        return studentsMarks;
    }

    public void setStudentsMarks(int studentsMarks) {
        this.studentsMarks = studentsMarks;
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("roomNumber", roomNumber);
        object.put("Instructor ", instructor.toJson());
        object.put("Instructor", classManeger.toJson());

//        object.put("Student", toJson(students.toString())); todo
        object.put(" Student", mangerAssistance.toJson());
        object.put("studentsMarks", studentsMarks);
        object.put("Section", Section);
        object.put("Level", "Level");
        return object;
    }

    public schoolJson fromJson(JSONObject object) {
        return (schoolJson) (object);
    }
}


