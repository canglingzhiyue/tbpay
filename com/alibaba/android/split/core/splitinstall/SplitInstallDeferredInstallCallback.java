package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallDeferredInstallCallback extends SplitInstallServiceCallback {
    static {
        kge.a(418618284);
    }

    public SplitInstallDeferredInstallCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredInstall(Bundle bundle) throws RemoteException {
        super.onDeferredInstall(bundle);
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) null);
    }
}
