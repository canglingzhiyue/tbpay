package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class dyo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STREAM_FLAG = "streamFlag";

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, a> f27115a;
    private static List<b> b;

    /* loaded from: classes4.dex */
    public static class a {
        public volatile Boolean c;
        public volatile int e;

        /* renamed from: a  reason: collision with root package name */
        public volatile int f27116a = -1;
        public volatile boolean b = false;
        public volatile String d = "";

        static {
            kge.a(2108362285);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(a aVar);
    }

    static {
        kge.a(2094834386);
        f27115a = new ConcurrentHashMap<>();
        b = new ArrayList();
        emu.a("com.taobao.android.detail.core.detail.controller.stream.DetailStreamDataEngine");
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875f624b", new Object[]{aVar, str});
            return;
        }
        aVar.f27116a = 0;
        f27115a.put(str, aVar);
        for (b bVar : b) {
            bVar.a(aVar);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        for (Map.Entry<String, a> entry : f27115a.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().f27116a = 2;
            }
        }
        f27115a.clear();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        a remove = f27115a.remove(str);
        if (remove == null) {
            return;
        }
        remove.f27116a = 2;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dc7b20", new Object[]{bVar});
        } else if (b.contains(bVar)) {
        } else {
            b.add(bVar);
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b7e561", new Object[]{bVar});
        } else {
            b.remove(bVar);
        }
    }

    public static void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{detailCoreActivity});
            return;
        }
        try {
            b.clear();
            if (com.taobao.android.detail.core.detail.activity.a.a() == 0) {
                a();
            } else {
                a(b(detailCoreActivity));
            }
        } catch (Exception e) {
            i.a(n.a("DetailStreamDataEngine"), "detailStreamDataEngine destroy error", e);
        }
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a3543ddc", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return f27115a.get(str);
        }
        return null;
    }

    public static boolean a(Activity activity) {
        a b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        String b3 = b(activity);
        if (TextUtils.isEmpty(b3) || (b2 = b(b3)) == null) {
            return false;
        }
        return b2.b;
    }

    public static String b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92892385", new Object[]{activity}) : (activity == null || activity.getIntent() == null) ? "" : activity.getIntent().getStringExtra(STREAM_FLAG);
    }
}
