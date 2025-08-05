package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallGetSessionCallback extends SplitInstallServiceCallback {
    static {
        kge.a(772804954);
    }

    public SplitInstallGetSessionCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSession(int i, Bundle bundle) throws RemoteException {
        super.onGetSession(i, bundle);
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) n.a(bundle));
    }
}
