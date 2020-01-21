package bean;

import org.json.simple.JSONObject;

public class Bean1 {

    private String name;

    private JSONObject obj;

    public Bean1(String name, JSONObject obj) {
        this.name = name;
        this.obj = obj;
    }

    public Bean1() {
    }

    public String getName() {
        return name;
    }

    public JSONObject getObj() {
        return obj;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setObj(JSONObject obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "name='" + name + '\'' +
                ", obj=" + obj +
                '}';
    }
}
