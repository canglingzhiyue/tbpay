package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import tb.dgt;

/* loaded from: classes4.dex */
public class dgp implements dgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dgq f26737a;

    static {
        kge.a(-1508328933);
        kge.a(2114953407);
    }

    public dgp(dgq dgqVar) {
        this.f26737a = dgqVar;
    }

    @Override // tb.dgo
    public void a(AdMonitorType adMonitorType, String str, dgr dgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82bb3b9a", new Object[]{this, adMonitorType, str, dgrVar});
        } else {
            this.f26737a.a(new dgt.a(str).c(20000).b(30000).a(3).a(HttpConstant.USER_AGENT, dhb.a()).a(), dgrVar);
        }
    }
}
