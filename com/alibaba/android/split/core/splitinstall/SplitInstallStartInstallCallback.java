package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallStartInstallCallback extends SplitInstallServiceCallback {
    static {
        kge.a(-1606672493);
    }

    public SplitInstallStartInstallCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onStartInstall(int i, Bundle bundle) throws RemoteException {
        super.onStartInstall(i, bundle);
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) Integer.valueOf(i));
    }
}
