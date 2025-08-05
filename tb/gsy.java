package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;

/* loaded from: classes5.dex */
public class gsy implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gsx f28434a;
    private final Throwable b;

    static {
        kge.a(1852412773);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "FailureState";
    }

    public gsy(gsx gsxVar, Throwable th) {
        this.f28434a = gsxVar;
        this.b = th;
    }

    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        aVar.d().d();
        String a2 = a();
        gsv.a(a2, "failed from state: " + this.f28434a.a(), this.b);
    }
}
