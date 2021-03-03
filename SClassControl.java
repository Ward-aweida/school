package school.control;


import school.model.*;

import java.util.Random;

public class SClassControl {

    private SClass sClass;


    public SClassControl(SClass sClass) {
        this.sClass = sClass;
    }

    public SClass getsClass() {
        return sClass;
    }

    public void setsClass(SClass sClass) {
        this.sClass = sClass;
    }

    public void addStudent(Student student) {
        sClass.getStudents().add(student);
    }




    public void assignRoomNumber() {
        sClass.setRoomNumber(1);
    }


    public void assignBooks(Book books) {
        sClass.setBooks(books);
    }

    private void setInstructor(Random random) {
        random(sClass.getMangerAssistance());
    }

    private void random(Student mangerAssistance) {
    }

    //Assign the top avg student as manger Assistance
    public void Avaerge() {

        int arr[] = {92, 67, 87, 98, 89, 74};
        int n = arr.length;
        double sum = 0;
        double average, percentage;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        average = sum / n;
        percentage = (sum / (n * 100)) * 100;

        System.out.println("Average Marks = " + average);
        System.out.println("========================");
        System.out.print("Percentage = " + percentage + "%");
    }

    public void topAvgAsManger(double average, SClass sClass) {


    }

}
