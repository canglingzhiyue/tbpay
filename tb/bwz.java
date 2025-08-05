package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;

/* loaded from: classes6.dex */
public final class bwz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-870273404);
    }

    public static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Exception e) {
            bxb.a(OrderBizCode.logisticsDetail, "反射创建失败", str + "," + e.getMessage());
            return null;
        }
    }

    public static Object a(String str, String str2, Object obj, Class<?> cls) {
        try {
            return Class.forName(str).getMethod(str2, cls).invoke(null, obj);
        } catch (Exception e) {
            bxb.a(OrderBizCode.logisticsDetail, "反射调用static方法失败", str + "," + str2 + "," + e.getMessage());
            return null;
        }
    }
}
