package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes4.dex */
public class iea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f28957a = new ConcurrentHashMap<>();

    public static synchronized void a(String str, Method method) {
        synchronized (iea.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59d68da", new Object[]{str, method});
                return;
            }
            if (method != null) {
                f28957a.put(str, method);
            }
        }
    }
}
