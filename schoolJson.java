package school.model;

import org.json.simple.JSONObject;

public interface schoolJson <T>{
    JSONObject toJson();
    schoolJson fromJson(JSONObject jsonObject);

}

