package cn.sirLiu.model.json;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:57
 */
public class Msg extends JSONObject {

    private String code;

    private Msg(String code) {
        this.code = code;
    }

    public static Msg success() {
        Msg msg = new Msg("SUCCESS");
        msg.put("code", msg.code);
        return msg;
    }

    public static Msg fail() {
        Msg msg = new Msg("FAIL");
        msg.put("code", msg.code);
        return msg;
    }

    public Msg add(String key, Object value) {
        this.put(key, value);
        return this;
    }

    /**
     * 如果map的一个entry的value是list，就不能把list解析成json
     *
     * @return
     */
    @Override
    public String toString() {
//        StringBuffer jsonString = new StringBuffer("{");
//        jsonString.append("\"code\":\"" + code + "\",");
//        for (Map.Entry<String, Object> entry : data.entrySet()) {
//            jsonString.append("\"" + entry.getKey() + "\":" + "\"" + JSON.toJSON(entry.getValue()) + "\",");
//        }
//        jsonString.replace(jsonString.length() - 1, jsonString.length(), "}");
//
//        return jsonString.toString();

        return toJSONString(this);
    }
}
