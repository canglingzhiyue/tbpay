package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;

/* loaded from: classes8.dex */
public class tif {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP = "OrderListPrefetch";

    /* renamed from: a  reason: collision with root package name */
    private static osd f34116a;
    private static AwesomeGetData b;
    private static Boolean c;
    private static Integer d;

    static {
        kge.a(999413869);
        f34116a = null;
        b = null;
        c = false;
        d = 0;
    }

    public static osd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osd) ipChange.ipc$dispatch("f08d61e", new Object[0]);
        }
        if (f34116a == null) {
            f34116a = osd.a(ksk.REC_ORDER_LIST);
        }
        return f34116a;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        e.c("OrderListPrefetchManager", "prefetch");
        d = Integer.valueOf(d.intValue() + 1);
        if (h().booleanValue()) {
            return;
        }
        if (b != null) {
            c = true;
        } else {
            a().u();
        }
    }

    public static void a(AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6637", new Object[]{awesomeGetData});
            return;
        }
        e.c("OrderListPrefetchManager", "savePrefetchData");
        b = awesomeGetData;
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            b = null;
        }
    }

    public static Boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("efdd6667", new Object[0]);
        }
        if (b != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static AwesomeGetData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetData) ipChange.ipc$dispatch("3c4cfc7a", new Object[0]);
        }
        e.c("OrderListPrefetchManager", "getAndClearPrefetchData");
        AwesomeGetData awesomeGetData = b;
        g();
        if (c.booleanValue()) {
            a().u();
            c = false;
        }
        return awesomeGetData;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        e.c("OrderListPrefetchManager", "destroy");
        if (h().booleanValue()) {
            return;
        }
        g();
        c = false;
        d = 0;
        try {
            a().e();
            f34116a = null;
        } catch (Throwable th) {
            e.a("OrderListPrefetchManager", "RecommendContainer destroy", th);
        }
    }

    public static Boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ce72322a", new Object[0]);
        }
        boolean z = true;
        if (d.intValue() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("62d564ac", new Object[0]);
        }
        if (!j.a("disable_order_list_prefetch", false) && !b.c()) {
            return false;
        }
        return true;
    }
}
