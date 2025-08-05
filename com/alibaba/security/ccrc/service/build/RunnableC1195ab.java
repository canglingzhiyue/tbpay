package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.ab  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class RunnableC1195ab implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f3292a;
    public final /* synthetic */ C1198bb b;

    public RunnableC1195ab(C1198bb c1198bb, Map map) {
        this.b = c1198bb;
        this.f3292a = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        C1198bb c1198bb = this.b;
        C1198bb.$ipChange.a(this.f3292a);
    }
}
