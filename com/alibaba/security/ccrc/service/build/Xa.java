package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Xa implements InterfaceC1251tb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3285a;
    public final /* synthetic */ Eb b;
    public final /* synthetic */ C1198bb c;

    public Xa(C1198bb c1198bb, long j, Eb eb) {
        this.c = c1198bb;
        this.f3285a = j;
        this.b = eb;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1251tb
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3285a;
        StringBuilder a2 = Yb.a("%s algo download model ");
        a2.append(z ? "success" : "fail");
        a2.append(",cost time is %s, cid is %s");
        Logging.d(C1198bb.f3294a, String.format(a2.toString(), this.b.algoCode(), Long.valueOf(currentTimeMillis), this.b.a()));
    }
}
