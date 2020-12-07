package cn.cnhoyun.chapter14;


import java.util.HashMap;
import java.util.Map;

/**
 * 接受参数
 */
public class Params extends HashMap<String,Object> implements Map<String,Object> {

    private Params() {
    }

    private Params(Map<? extends String, ?> m) {
        super(m);
    }

    public static Params build(Map<String,?> param){
        return new Params(param);
    }

    public static Params buildDefault(){
        return new Params();
    }

    public Params putE(String key, Object value) {
        put(key, value);
        return this;
    }


    public Integer getInt(String key){
        Object obj = this.get(key);
        if(obj instanceof Integer){
            return (Integer) obj;
        }else if(obj instanceof String){
            return Integer.valueOf(obj.toString());
        }
        return null;
    }

    public String getString(String key){
        Object obj = this.get(key);
        return obj==null?null:obj.toString();
    }

    @SuppressWarnings("unchecked")
    public <T> T getObj(String key){
        return (T) this.get(key);
    }
}