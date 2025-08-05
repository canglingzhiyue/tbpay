package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallCancelCallback extends SplitInstallServiceCallback {
    static {
        kge.a(588274164);
    }

    public SplitInstallCancelCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCancelInstall(int i, Bundle bundle) throws RemoteException {
        super.onCancelInstall(i, bundle);
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) null);
    }
}
