package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.d;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ezw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f27704a;
    private static String b;
    private static String c;

    static {
        kge.a(-699876525);
        f27704a = new HashMap<>(2);
        b = "longitude";
        c = "latitude";
        f27704a.put(c, "0");
        f27704a.put(b, "0");
    }

    public static HashMap<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2c8c41c3", new Object[]{context});
        }
        d h = euy.h();
        if (h == null) {
            return f27704a;
        }
        d.a a2 = h.a(context);
        f27704a.put(b, a2.f10211a);
        f27704a.put(c, a2.b);
        return f27704a;
    }
}
