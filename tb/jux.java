package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.util.g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public class jux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ConcurrentMap<String, juv> f29796a;

    static {
        kge.a(-719768456);
        f29796a = new ConcurrentHashMap();
    }

    public static boolean a(String str, Class<? extends WeexModule> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7af6b54f", new Object[]{str, cls})).booleanValue();
        }
        c.a(!WeexInnerModule.class.isAssignableFrom(cls), "Subclass of WeexInnerModule should use registerInnerModule to register");
        return a(str, new juz(cls));
    }

    private static boolean a(String str, juv juvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3008783b", new Object[]{str, juvVar})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && juvVar != null) {
            if (f29796a != null && f29796a.containsKey(str)) {
                g.c("register module twice,Module name is  " + str);
            }
            try {
                f29796a.put(str, juvVar);
                return true;
            } catch (Exception e) {
                g.c("register module ", e);
            }
        }
        return false;
    }

    public static void a(String str, Class<? extends WeexInnerModule> cls, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b43df4", new Object[]{str, cls, strArr});
        } else if (TextUtils.isEmpty(str) || cls == null) {
            g.d("register module illegal");
        } else {
            if (f29796a.containsKey(str)) {
                g.c("register module twice,Module name is  " + str);
            }
            c.a(WeexInnerModule.class.isAssignableFrom(cls), "registerInnerModule only support WeexInnerModule");
            f29796a.put(str, new qnj(cls, strArr));
        }
    }

    public static juv<?> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (juv) ipChange.ipc$dispatch("7c7142e9", new Object[]{str}) : f29796a.get(str);
    }
}
