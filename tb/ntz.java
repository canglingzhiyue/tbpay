package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.s;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes8.dex */
public final class ntz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ntz INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f31764a;

    static {
        kge.a(915766229);
        INSTANCE = new ntz();
        f31764a = new ConcurrentHashMap<>();
    }

    private ntz() {
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String persistenceData = s.b("searchBts", "");
        q.a((Object) persistenceData, "persistenceData");
        b(persistenceData);
    }

    public final void a(String forBts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, forBts});
            return;
        }
        q.c(forBts, "forBts");
        s.a("searchBts", forBts);
    }

    public final void b(String forBts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, forBts});
            return;
        }
        q.c(forBts, "forBts");
        String str = forBts;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : n.b((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null)) {
            if (!TextUtils.isEmpty(str2)) {
                List b = n.b((CharSequence) str2, new String[]{":"}, false, 0, 6, (Object) null);
                if (b.size() >= 2) {
                    String str3 = (String) b.get(0);
                    String str4 = (String) b.get(1);
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        f31764a.put(str3, str4);
                    }
                }
            }
        }
    }

    public final String c(String layerName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, layerName});
        }
        q.c(layerName, "layerName");
        return f31764a.get(layerName);
    }
}
