package tb;

import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class gwp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEPERATER = "/";

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, ValueCallback<String>> f28542a;

    static {
        kge.a(379156331);
        f28542a = new ConcurrentHashMap<>();
    }

    public static void a(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4d5078", new Object[]{str, valueCallback});
        } else {
            f28542a.put(str, valueCallback);
        }
    }

    public static ValueCallback<String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValueCallback) ipChange.ipc$dispatch("5a187e2a", new Object[]{str}) : f28542a.get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            f28542a.remove(str);
        }
    }
}
