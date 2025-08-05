package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, String> f26475a;
    private volatile Map<String, String> b;
    private volatile Map<String, String> c;

    static {
        kge.a(441101482);
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f26475a = map;
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }
}
