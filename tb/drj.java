package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class drj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Object f26922a;
    public static Method b;

    public static /* synthetic */ List a(Map map) throws Exception {
        Method method = b;
        if (method != null) {
            Object invoke = method.invoke(f26922a, map);
            if (!(invoke instanceof List)) {
                return null;
            }
            return (List) invoke;
        }
        return null;
    }

    public static synchronized bxl a() {
        $$Lambda$jPaiWUZpVdFMaHW_g29ItB8Faw __lambda_jpaiwuzpvdfmahw_g29itb8faw;
        synchronized (drj.class) {
            if (f26922a == null || b == null) {
                Class<?> cls = Class.forName("com.alipay.android.app.crender.ext.TemplateTransport");
                f26922a = cls.newInstance();
                b = cls.getMethod("fetchTemplates", Map.class);
            }
            __lambda_jpaiwuzpvdfmahw_g29itb8faw = $$Lambda$jPaiWUZpVdFMaHW_g29ItB8Faw.INSTANCE;
        }
        return __lambda_jpaiwuzpvdfmahw_g29itb8faw;
    }
}
