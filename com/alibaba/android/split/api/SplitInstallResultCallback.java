package com.alibaba.android.split.api;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public interface SplitInstallResultCallback extends IInterface {
    void onCancelInstall(int i, Bundle bundle) throws RemoteException;

    void onCompleteInstall(int i) throws RemoteException;

    void onCompleteInstallForAppUpdate() throws RemoteException;

    void onDeferredInstall(Bundle bundle) throws RemoteException;

    void onDeferredUninstall(Bundle bundle) throws RemoteException;

    void onError(Bundle bundle) throws RemoteException;

    void onGetSession(int i, Bundle bundle) throws RemoteException;

    void onGetSessionStates(List<Bundle> list) throws RemoteException;

    void onGetSplitsForAppUpdate() throws RemoteException;

    void onStartInstall(int i, Bundle bundle) throws RemoteException;
}
