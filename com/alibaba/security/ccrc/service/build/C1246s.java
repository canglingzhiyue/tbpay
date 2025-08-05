package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimerTask;
import java.util.concurrent.Future;

/* renamed from: com.alibaba.security.ccrc.service.build.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1246s extends TimerTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Future f3325a;

    public C1246s(Future future) {
        this.f3325a = future;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f3325a.cancel(true);
        }
    }
}
