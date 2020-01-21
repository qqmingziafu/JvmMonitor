package util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

public class ResponesUtil {

    public static <T> T respones(Map<String, Object[]> params, Class<T> tClass) throws IllegalAccessException, InstantiationException {
        Method[] methods = tClass.getMethods();
        Object respones = tClass.newInstance();
        Arrays.stream(methods).forEach(method -> {
            String tMethodName = method.getName();
            params.keySet().stream().forEach(methodName -> {
                if(tMethodName.equals(methodName)){
                    Object[] param = params.get(methodName);
                    try {
                        method.invoke(respones, param);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            });
        });
        return convertValue(respones,tClass );
    }

    public static <T> T convertValue(Object t, Class<T> tClass){
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(t, tClass);
    }

}
