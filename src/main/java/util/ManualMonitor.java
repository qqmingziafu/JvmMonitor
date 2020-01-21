package util;

import org.apache.lucene.util.RamUsageEstimator;

public class ManualMonitor {

    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params：[object]
     * @Return：long
     * @Description:计算指定对象及其引用树上的所有对象的综合大小，单位字节
     */
    public static long sizeOf(Object object){
        return RamUsageEstimator.sizeOf(object);
    }
    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params：[object]
     * @Return：long
     * @Description:计算指定对象本身在堆空间的大小，单位字节
     */
    public static long shallowSizeOf (Object object){
        return RamUsageEstimator.shallowSizeOf(object);
    }
    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params：[object]
     * @Return：long
     * @Description: 计算指定对象及其引用树上的所有对象的综合大小，返回可读的结果，如：2KB
     */
    public static String humanSizeOf (Object object){
        return RamUsageEstimator.humanSizeOf(object);
    }
}
