package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends jnd>> f29634a;

    static {
        kge.a(-1097567031);
        f29634a = new ConcurrentHashMap();
    }

    public static void a(String str, Class<? extends jnd> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (f29634a.containsKey(str)) {
                if (!f29634a.get(str).equals(cls)) {
                    throw new IllegalStateException(String.format("This component type = %s was registed", str));
                }
            } else if (cls == null) {
            } else {
                f29634a.put(str, cls);
            }
        }
    }

    public static Class<? extends jnd> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("582938df", new Object[]{str}) : f29634a.get(str);
    }
}
