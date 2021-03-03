
package school.model;


import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Date;


public class Student extends Person implements schoolJson {

    private SClass sClass;


    public Student(int id, String name, Date dateOfBarthe, SClass sClass, Gender gende) {
        super(id, name, dateOfBarthe, gende);
        this.sClass = sClass;
    }


    ArrayList<String> students = new ArrayList<String>();


    public JSONObject toJson() {
        JSONObject object = super.toJson();
        object.put("sclass-id", sClass.getId());
        return object;
    }

    public schoolJson fromJson(JSONObject object)  {

        return (schoolJson) (object);

    }


}
