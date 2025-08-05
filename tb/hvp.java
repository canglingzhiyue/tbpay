package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.f;

/* loaded from: classes6.dex */
public final class hvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28815a;

    static {
        kge.a(184148651);
        f28815a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f28815a) {
        } else {
            b();
            f28815a = true;
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f.a(new hxe());
        f.a(new hxh());
        f.a(new hxf());
        long currentTimeMillis2 = System.currentTimeMillis();
        hyn.a("OrderInitializer", "initOrderAdapters", "initDetailAdapters 1:" + (currentTimeMillis2 - currentTimeMillis) + "ms");
    }
}
