package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class Ya implements InterfaceC1254ub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean[] f3287a;
    public final /* synthetic */ List b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ InterfaceC1257vb d;
    public final /* synthetic */ C1198bb e;

    public Ya(C1198bb c1198bb, boolean[] zArr, List list, AtomicInteger atomicInteger, InterfaceC1257vb interfaceC1257vb) {
        this.e = c1198bb;
        this.f3287a = zArr;
        this.b = list;
        this.c = atomicInteger;
        this.d = interfaceC1257vb;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1254ub
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        boolean[] zArr = this.f3287a;
        zArr[0] = zArr[0] & z;
        if (!z) {
            this.b.add(str);
        }
        if (this.c.decrementAndGet() != 0) {
            return;
        }
        if (!this.f3287a[0]) {
            C1198bb c1198bb = this.e;
            C1198bb.$ipChange.clear();
        }
        InterfaceC1257vb interfaceC1257vb = this.d;
        boolean[] zArr2 = this.f3287a;
        interfaceC1257vb.a(zArr2[0], zArr2[0] ? null : JsonUtils.toJSONString(this.b), null);
    }
}
