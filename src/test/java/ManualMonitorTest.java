import bean.Bean1;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.junit.Test;
import util.ManualMonitor;

public class ManualMonitorTest {

    private Logger _log = Logger.getLogger(ManualMonitorTest.class);

    @Test
    public void ManualMonitor() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key", "k");
        jsonObject.put("value", "v");
        String name = "test";
        Bean1 bean1 = new Bean1(name, jsonObject);
        Bean1 bean2 = new Bean1();
        logObject(bean1);
        System.out.println();
        logObject(name);
        System.out.println();
        logObject(jsonObject);
        System.out.println();
        logObject(bean2);
    }

    public void logObject(Object object) {
        _log.info("JVMÏûºÄhumanSizeOf£º" + ManualMonitor.humanSizeOf(object));
        _log.info("JVMÏûºÄsizeOf£º" + ManualMonitor.sizeOf(object));
        _log.info("JVMÏûºÄshallowSizeOf£º" + ManualMonitor.shallowSizeOf(object));
    }

}
