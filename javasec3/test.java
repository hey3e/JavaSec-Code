package javasec3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class test {
    public static void main(String[] args) {
        Person person = new Person(18);
        String json = JSON.toJSONString(person, SerializerFeature.WriteClassName);
        System.out.println(json);
        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(jsonObject);
    }
}
