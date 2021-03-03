package school.Test;


import school.control.SClassControl;
import school.control.SchoolControl;
import school.model.*;
import school.model.constance.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;

public class Test {


    public static void main(String[] args) {
        Date date = new Date(1790, 2, 18);
        Date date1 = new Date(2000, 2, 15);
        Date date2 = new Date(1998, 1, 17);
        Date date3 = new Date(2008, 1, 30);
        Date releaseYear = new Date(2001, 02, 23);
        Level level;

        ArrayList<Student> students = null;
        ArrayList<Lecture> lectures = null;
        Student MangerAsstance = null;

        Person person = new Person(10, "mohamad", date, Person.Gender.Male);

        Admin admin = new Admin(1, "Faris", date, Person.Gender.Male);
        Admin admin1 = new Admin(4, "Sanaa", date2, Person.Gender.Female);
        Book book = new Book(15, "english", "einglish for palestine", 235, releaseYear);
        Period period = new Period(Period.Day.MONDAY, Period.Time.Thered);
        Lecture lecture = new Lecture(10, "english", book, period);
        Instructor instructor = new Instructor(1, "mohamad", date, Person.Gender.Male, lecture);
        Instructor instructor1 = new Instructor(2, "Monther", date1, Person.Gender.Male, lecture);

        SClass sClass = new SClass(15,
                25,
                book,
                instructor
                , instructor,
                students,
                MangerAsstance,
                90,
                "");

        Student student = new Student(2, "Sondos", date1, sClass, Person.Gender.Male);
        Table table = new Table(12, lectures, sClass);

        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor);
        instructors.add(instructor1);
        HashMap<Level, ArrayList<SClass>> sClasses = new HashMap<>();

        School school = new School(admin, instructors, sClasses);
        SClassControl sClassControl = new SClassControl(sClass);
        SchoolControl schoolControl = new SchoolControl(school);


        //                test person
        System.out.println(person.toJson());
        System.out.println(person.getId());
        System.out.println(person.setName("Amr"));
        System.out.println(person.toString());
        System.out.println(person.getGender());
        //  System.out.println(person.setGender(Person.Gender.Male));
        System.out.println(person.setDateOfBarthe(releaseYear));
        System.out.println(person.setId(15));
        System.out.println(person.getName());

        // ************************************************************************************************
        //                                                            test admin
        System.out.println(admin.getId());
        System.out.println(admin.getDateOfBarth());
        System.out.println(admin.getGender());
        System.out.println(admin.getName());
        System.out.println(admin.getClass());
        System.out.println(admin.setId(12));
        System.out.println(admin.setDateOfBarthe(date2));
        // System.out.println(admin.setGender(Person.Gender.Male));
        System.out.println(admin.setName("hani"));
        System.out.println(admin.toJson());

        // ************************************************************************************************

        //                                                            test book
        System.out.println(book.getId());
        System.out.println(book.getName());
        System.out.println(book.getAutherName());
        System.out.println(book.getNomberOfPages());
        System.out.println(book.getClass());
        System.out.println(book.getReleaseYear());
        System.out.println(book.setId(2));
        System.out.println(book.setAutherName("Enghl fo pales"));
        System.out.println(book.setName("engli"));
        System.out.println(book.setNomberOfPages(289));
        System.out.println(book.setReleaseYear(date3));
        System.out.println(book.toJson());
        System.out.println(book.toString());
        // ************************************************************************************************

        //                                test period
        System.out.println(period.getTime());
        System.out.println(period.getDay());
        System.out.println(period.setDay(Period.Day.FRIDAY));
        System.out.println(period.setTime(Period.Time.Fiveth));
        // ************************************************************************************************

        System.out.println(lecture.getId());
        System.out.println(lecture.setId(72));
        System.out.println(lecture.setName("Tahani"));
        System.out.println();
        // ************************************************************************************************


        System.out.println(admin.setId(15));
        System.out.println(admin.setName("Haneen"));
        // System.out.println(admin.setGender(Person.Gender.Female));
        System.out.println(admin.setDateOfBarthe(date1));

        schoolControl.saveSchool();
        schoolControl.importSchool();

        System.out.println(schoolControl);
        System.out.println(sClassControl);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }


}

