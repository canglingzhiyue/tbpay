package tb;

import com.alibaba.appmonitor.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bsw;

/* loaded from: classes.dex */
public class aov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aov f25485a;

    static {
        kge.a(-602164945);
        kge.a(1092876423);
        f25485a = new aov();
    }

    public static aov a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aov) ipChange.ipc$dispatch("f026c16", new Object[0]) : f25485a;
    }

    public void onEvent(aou aouVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f99140b", new Object[]{this, aouVar});
        } else if (aouVar.b == EventType.COUNTER) {
            bsw.b.a(aou.module, aouVar.f25484a, aouVar.c, aouVar.d.doubleValue());
        } else if (aouVar.b != EventType.STAT) {
        } else {
            bsw.d.a(aou.module, aouVar.f25484a, aouVar.e, aouVar.f);
        }
    }
}
