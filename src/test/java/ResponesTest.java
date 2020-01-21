import bean.Bean1;
import bean.Bean1Respones;
import bean.Bean2;
import bean.Bean2Respones;
import org.junit.Test;
import util.ResponesUtil;

import java.util.HashMap;
import java.util.Map;

public class ResponesTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        HashMap<String, Object[]> params = new HashMap<>();
        Object[] params1 = new Object[1];
        params1[0] = "success";
        Object[] param2 = new Object[1];
        param2[0] = "message";
        params.put("setStatus", params1);
        params.put("setMessage", param2);
        HashMap<String, Object[]> params2 = (HashMap<String, Object[]>) params.clone();
        Object[] param3 = new Object[1];
        param3[0] = new Bean1();
        Object[] param4 = new Object[1];
        param4[0] = new Bean2();
        params.put("setResult", param3);
        params2.put("setResult", param4);

        System.out.println(ResponesUtil.respones(params, Bean1Respones.class));
        System.out.println(ResponesUtil.respones(params2, Bean2Respones.class));
    }
}
