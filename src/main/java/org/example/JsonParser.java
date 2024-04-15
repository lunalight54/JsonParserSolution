package org.example;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JsonParser {
    public boolean ContainsAsterisk(String json) {
        Object obj = null;

        try {
            obj = new JSONParser().parse(json);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject j = (JSONObject) obj;
        for (Object key : j.keySet()) {
            if (key.toString().contains("*")) {
                return true;
            }
        }

        for(Object value : j.values()) {
            if(value.toString().contains("*")) {
                return true;
            }
        }
        return false;
    }
}
