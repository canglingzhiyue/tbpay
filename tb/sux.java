package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class sux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private spx f33919a;
    private final String b;

    static {
        kge.a(936620070);
    }

    public sux(String fluidInstanceId) {
        q.d(fluidInstanceId, "fluidInstanceId");
        this.b = fluidInstanceId;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final spx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spx) ipChange.ipc$dispatch("f0a9ec3", new Object[]{this}) : this.f33919a;
    }

    public final void a(spx spxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34133d", new Object[]{this, spxVar});
        } else {
            this.f33919a = spxVar;
        }
    }
}
