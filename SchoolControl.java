package school.control;



import school.model.Admin;
import school.model.Instructor;
import school.model.SClass;
import school.model.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class SchoolControl {

    private School school;


    public SchoolControl(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setAdmin(Admin admin) {
        school.setAdmin(admin);
    }


    public void addSClass(SClass sClass) {

        List<SClass> levelSClasses = school.getsClasses().get(sClass);
        char section = 'a';
        section += levelSClasses.size();
        sClass.setSection(section);
        levelSClasses.add(sClass);


    }

    public void addInstructor(Instructor instructor) {
        school.getInstructors().add(instructor);
    }


    public void saveSchool() {

        try (FileWriter file = new FileWriter("school12.json")) {
            file.write(school.toJson().toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(school.toJson());
    }


    public void importSchool() {

        try {
            File myObj = new File("school12.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    }


