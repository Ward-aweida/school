package school.model;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

public class School implements schoolJson<JSONObject> {

    private Admin admin;
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private HashMap<Level, ArrayList<SClass>> sClasses = new HashMap<>();


    public School(Admin admin, ArrayList<Instructor> instructors, HashMap<Level, ArrayList<SClass>> sClasses) {
        super();
        this.admin = admin;
        this.instructors = instructors;
        this.sClasses = sClasses;
    }


    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


    public HashMap<Level, ArrayList<SClass>> getsClasses() {
        return sClasses;
    }

    public void setsClasses(HashMap<Level, ArrayList<SClass>> sClasses) {
        this.sClasses = sClasses;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }


    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("admin", admin.toJson());
        JSONArray instructors = new JSONArray();
        for (int i = 0; i < instructors.toArray().length; i++) {
            ;
        }
        System.out.println(instructors);
        object.put("Instructors", instructors);
        object.put("SClass", sClasses);
        return object;
    }



     public schoolJson fromJson(JSONObject object) {
         return (schoolJson) (object);
     }

}
