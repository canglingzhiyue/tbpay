package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallDeferredUninstallCallback extends SplitInstallServiceCallback {
    static {
        kge.a(-385422093);
    }

    public SplitInstallDeferredUninstallCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredUninstall(Bundle bundle) throws RemoteException {
        super.onDeferredUninstall(bundle);
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) null);
    }
}
