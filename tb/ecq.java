package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.c;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ecq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f27198a;
    private static String b;
    private static String c;

    static {
        kge.a(-765158011);
        f27198a = new HashMap<>(4);
        b = "longitude";
        c = "latitude";
        f27198a.put(c, "0");
        f27198a.put(b, "0");
        emu.a("com.taobao.android.detail.core.detail.utils.LocationUtils");
    }

    public static HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        c k = epj.k();
        if (k == null) {
            return f27198a;
        }
        c.a a2 = k.a(epo.a());
        f27198a.put(b, a2.f10067a);
        f27198a.put(c, a2.b);
        return f27198a;
    }
}
