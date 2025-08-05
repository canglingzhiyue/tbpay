package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class SplitInstallGetSessionStatesCallback extends SplitInstallServiceCallback {
    static {
        kge.a(1677540796);
    }

    public SplitInstallGetSessionStatesCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        super(kVar, mVar);
    }

    @Override // com.alibaba.android.split.core.splitinstall.SplitInstallServiceCallback, com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSessionStates(List<Bundle> list) throws RemoteException {
        super.onGetSessionStates(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Bundle bundle : list) {
            arrayList.add(n.a(bundle));
        }
        this.taskWrapper.a((com.alibaba.android.split.core.tasks.m) arrayList);
    }
}
