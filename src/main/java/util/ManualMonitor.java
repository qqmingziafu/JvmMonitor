package util;

import org.apache.lucene.util.RamUsageEstimator;

public class ManualMonitor {

    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params��[object]
     * @Return��long
     * @Description:����ָ���������������ϵ����ж�����ۺϴ�С����λ�ֽ�
     */
    public static long sizeOf(Object object){
        return RamUsageEstimator.sizeOf(object);
    }
    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params��[object]
     * @Return��long
     * @Description:����ָ���������ڶѿռ�Ĵ�С����λ�ֽ�
     */
    public static long shallowSizeOf (Object object){
        return RamUsageEstimator.shallowSizeOf(object);
    }
    /**
     * @Menthod:sizeOf
     * @Type:method
     * @Author:cyj
     * @Date: 2020-01-18 22:32
     * @Params��[object]
     * @Return��long
     * @Description: ����ָ���������������ϵ����ж�����ۺϴ�С�����ؿɶ��Ľ�����磺2KB
     */
    public static String humanSizeOf (Object object){
        return RamUsageEstimator.humanSizeOf(object);
    }
}
