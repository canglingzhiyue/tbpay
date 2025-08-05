package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26501a;

    static {
        kge.a(171035457);
    }

    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f26501a) {
        } else {
            f26501a = true;
            cox.a("CropMonitor", "cropRequest", (List<String>) null, (List<String>) null);
            cox.a("CropMonitor", "cropImage", (List<String>) null, (List<String>) null);
            cox.a("CropMonitor", "cropPv", (List<String>) null, (List<String>) null);
        }
    }

    public static final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a();
        cox.a("CropMonitor", "cropImage");
    }

    public static final void a(String msg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{msg});
            return;
        }
        q.c(msg, "msg");
        a();
        cox.a("CropMonitor", "cropImage", "", msg);
    }

    public static final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        a();
        if (z) {
            cox.a("CropMonitor", "cropPv");
        } else {
            cox.a("CropMonitor", "cropPv", "", "");
        }
    }
}
