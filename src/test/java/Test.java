import com.alibaba.fastjson.JSONObject;
import utils.OkHttpApi;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        OkHttpApi api = new OkHttpApi();
        String run = api.run("https://restapi.amap.com/v3/weather/weatherInfo?city=310104&key=4bbb25b5db6510005eb24bae2ababb59");
        System.out.println(run);
        JSONObject jsonObject = JSONObject.parseObject(run);
        System.out.println(jsonObject);
        System.out.println(jsonObject.get("status"));
        System.out.println(jsonObject.get("lives"));
        jsonObject.get("lives");
    }
}
