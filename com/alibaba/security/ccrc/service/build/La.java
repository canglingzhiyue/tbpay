package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class La extends TimerTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ma f3257a;

    public La(Ma ma) {
        this.f3257a = ma;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f3257a.evictAll();
        }
    }
}
