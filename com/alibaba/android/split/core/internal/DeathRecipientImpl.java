package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class DeathRecipientImpl implements IBinder.DeathRecipient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ServiceManager serviceManager;

    static {
        kge.a(-1904877731);
        kge.a(1219188865);
    }

    public DeathRecipientImpl(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f12e35", new Object[]{this});
        } else {
            this.serviceManager.reportBinderDeath();
        }
    }
}
