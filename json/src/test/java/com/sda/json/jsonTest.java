package com.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class jsonTest {

    @Test
    public void a_testCreate() {
        JSONObject jsonObject = createJSONObject();

        System.out.println(jsonObject);
    }

    @Test
    public void b_testRead() {
        JSONObject jsonObject = createJSONObject();
        Object sold = jsonObject.get("sold");

        System.out.println(sold);
    }

    @Test
    public void c_testJacksonDatabind() throws IOException {
        Person person = new Person();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, person);
    }

    private JSONObject createJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nume", "Alex");
        jsonObject.put("cnp", 1910416295592L);
        jsonObject.put("varsta", 30);
        jsonObject.put("sold", 300.0);
        jsonObject.put("client", true);
        jsonObject.put("tag", Arrays.asList("tag1", "tag2", "tag5"));
        jsonObject.put("cafea", null);

        return jsonObject;
    }

    class Person {
        String nume = "Dan";
        int varsta = 21;
        boolean client = false;

        public String getNume() {
            return nume;
        }

        public int getVarsta() {
            return varsta;
        }

        public boolean isClient() {
            return client;
        }
    }
}
