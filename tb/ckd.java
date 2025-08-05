package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ckd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f26330a = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f26331a;
        public long b;
        public long c;
    }

    public static String a(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Map<String, a> map = f26330a;
        if (map == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if (System.currentTimeMillis() - aVar.b < aVar.c) {
            z = true;
        }
        if (z && aVar.f26331a != null) {
            return aVar.f26331a;
        }
        f26330a.remove(str);
        return null;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        a aVar = f26330a.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f26331a = str2;
        aVar.c = 86400000L;
        aVar.b = System.currentTimeMillis();
        f26330a.put(str, aVar);
    }
}
