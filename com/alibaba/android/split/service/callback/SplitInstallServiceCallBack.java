package com.alibaba.android.split.service.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import java.util.List;
import tb.bfx;
import tb.kge;

/* loaded from: classes2.dex */
public final class SplitInstallServiceCallBack extends BaseProxy implements SplitInstallResultCallback {
    static {
        kge.a(-210895521);
        kge.a(-834719474);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public void onCompleteInstallForAppUpdate() throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSplitsForAppUpdate() {
    }

    public SplitInstallServiceCallBack(IBinder iBinder) {
        super(iBinder, "com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onStartInstall(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        bfx.a(a2, bundle);
        a(2, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCompleteInstall(int i) {
        Parcel a2 = a();
        a2.writeInt(i);
        bfx.a(a2, (Parcelable) null);
        a(3, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onCancelInstall(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        bfx.a(a2, bundle);
        a(4, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSession(int i, Bundle bundle) {
        Parcel a2 = a();
        a2.writeInt(i);
        bfx.a(a2, bundle);
        a(5, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onError(Bundle bundle) {
        Parcel a2 = a();
        bfx.a(a2, bundle);
        a(6, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onGetSessionStates(List<Bundle> list) {
        Parcel a2 = a();
        a2.writeTypedList(list);
        a(7, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredUninstall(Bundle bundle) {
        Parcel a2 = a();
        bfx.a(a2, bundle);
        a(8, a2);
    }

    @Override // com.alibaba.android.split.api.SplitInstallResultCallback
    public final void onDeferredInstall(Bundle bundle) {
        Parcel a2 = a();
        bfx.a(a2, bundle);
        a(9, a2);
    }
}
