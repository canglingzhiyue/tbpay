package com.alibaba.android.split.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.alibaba.android.split.core.internal.ISplitInstallServiceCallback;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
class SplitInstallServiceCallback extends ISplitInstallServiceCallback {
    private final k splitInstallService;
    final com.alibaba.android.split.core.tasks.m taskWrapper;

    static {
        kge.a(-1396824155);
    }

    public SplitInstallServiceCallback(k kVar, com.alibaba.android.split.core.tasks.m mVar) {
        this.splitInstallService = kVar;
        this.taskWrapper = mVar;
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public void onStartInstall(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstall(int i) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    public void onCancelInstall(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void onGetSession(int i, Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onGetSession(%d)", Integer.valueOf(i));
    }

    public void onDeferredUninstall(Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onDeferredUninstall", new Object[0]);
    }

    public void onDeferredInstall(Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onDeferredInstall", new Object[0]);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstallForAppUpdate() throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().a("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSplitsForAppUpdate() throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().a("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onError(Bundle bundle) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        int i = bundle.getInt("error_code");
        k.b().d("onError(%d)", Integer.valueOf(i));
        this.taskWrapper.a((Exception) new SplitInstallException(i));
    }

    public void onGetSessionStates(List<Bundle> list) throws RemoteException {
        this.splitInstallService.f2474a.unbindService();
        k.b().d("onGetSessionStates", new Object[0]);
    }
}
