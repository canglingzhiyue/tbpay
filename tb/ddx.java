package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ddx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends BaseFrame>> f26713a;

    static {
        kge.a(856292450);
        f26713a = new HashMap();
    }

    public static void a(String str, Class<? extends BaseFrame> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            f26713a.put(str, cls);
        }
    }

    public static Class<? extends BaseFrame> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("582938df", new Object[]{str}) : f26713a.get(str);
    }
}
