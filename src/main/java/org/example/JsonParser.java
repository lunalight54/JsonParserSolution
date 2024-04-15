package org.example;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {
    public boolean ContainsAsterisk(String filePath) {
        Object obj = null;

        try {
            obj = new JSONParser().parse(new FileReader(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
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
