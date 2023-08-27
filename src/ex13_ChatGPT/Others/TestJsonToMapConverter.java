package ex13_ChatGPT.Others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestJsonToMapConverter {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John Doe\",\"age\":30,\"email\":\"john.doe@example.com\"}";

        System.out.println(jsonString); // {"name":"John Doe","age":30,"email":"john.doe@example.com"}
        System.out.println("------------");
        String[] json=jsonString.split(",");

        String[]  jsons=null;
        String key=null;
        String value=null;
        Map<String, Object> map=new HashMap<>();
        for(String s : json){
          jsons=s.split(":");
          key=jsons[0].trim();
          value=jsons[1].trim();
          map.put(key,value);
            System.out.println(map);
            //System.out.println(map.get(key));
        }







    }
}
