package com.alibaba.android.split.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public final class SplitInstallServiceProxy extends IInterfaceProxy implements ISplitInstallService {
    static {
        kge.a(285800466);
        kge.a(-2137992842);
    }

    public SplitInstallServiceProxy(IBinder iBinder) {
        super(iBinder, "com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void startInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeTypedList(list);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(2, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void cancelInstall(String str, int i, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeInt(i);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(4, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void getSessionState(String str, int i, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeInt(i);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(5, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void getSessionStates(String str, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(6, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void deferredUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeTypedList(list);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(7, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void deferredInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeTypedList(list);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(8, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void deferredLanguageInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeTypedList(list);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(13, obtainData);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public final void deferredLanguageUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        Parcel obtainData = obtainData();
        obtainData.writeString(str);
        obtainData.writeTypedList(list);
        ParcelUtils.writeParcel(obtainData, bundle);
        ParcelUtils.writeStrongBinder(obtainData, splitInstallResultCallback);
        transact(14, obtainData);
    }
}
