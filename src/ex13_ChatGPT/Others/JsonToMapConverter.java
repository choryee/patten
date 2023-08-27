package ex13_ChatGPT.Others;

import java.util.HashMap;
import java.util.Map;

public class JsonToMapConverter {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John Doe\",\"age\":30,\"email\":\"john.doe@example.com\"}";

        try {
            Map<String, Object> resultMap = convertJSONstringToMap(jsonString);
            System.out.println(resultMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Object> convertJSONstringToMap(String json) {
        Map<String, Object> map = new HashMap<>();

        json = json.trim(); //json.trim()은 주어진 문자열의 양쪽 끝에 있는 공백(공백, 탭, 줄 바꿈 등)을 제거하는 메서드입니다
        if (json.startsWith("{") && json.endsWith("}")) {
            json = json.substring(1, json.length() - 1); //주어진 JSON 문자열의 첫 번째 문자와 마지막 문자를 제외한 부분만을 추출하는 메서드 호출입니다.
            String[] keyValuePairs = json.split(",");
            for (String pair : keyValuePairs) {
                String[] keyValue = pair.split(":");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();

                    // JSON 문자열의 value가 숫자인 경우 숫자로 변환하여 저장
                    Object parsedValue = isNumeric(value) ? Integer.parseInt(value) : value;
                    map.put(key, parsedValue);
                }
            }
        }

        return map;
    }

    private static boolean isNumeric(String str) { // String으로 된것이 숫자인지 판별.
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
