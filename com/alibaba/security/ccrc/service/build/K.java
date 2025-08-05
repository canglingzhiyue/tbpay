package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.service.CcrcService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class K implements D {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcService.Config f3252a;
    public final /* synthetic */ OnCcrcCallback b;
    public final /* synthetic */ long c;
    public final /* synthetic */ M d;

    public K(M m, CcrcService.Config config, OnCcrcCallback onCcrcCallback, long j) {
        this.d = m;
        this.f3252a = config;
        this.b = onCcrcCallback;
        this.c = j;
    }

    @Override // com.alibaba.security.ccrc.service.build.D
    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else {
            M.a(this.d, this.f3252a, this.b, z, str, this.c);
        }
    }
}
