package soundsystem;

import java.util.Map;

public class MyBean {
    private String name;
    private int count;
    private Map<String, String> map;
    
    public MyBean() {
        this("");
    }
    
    public MyBean(String str) {
        System.out.println(str + "MyBean 생성자 호출!!!!");
    }
    
    public MyBean(Map<String, String> map) {
        this.map = map;
    }
    
    public MyBean(String name, int count) {
        this.name = name;
        this.count = count;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public String getValue(String key) {
        return map.get(key);
    }
}
