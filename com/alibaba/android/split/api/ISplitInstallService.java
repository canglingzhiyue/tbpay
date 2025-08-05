package com.alibaba.android.split.api;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public interface ISplitInstallService extends IInterface {
    void cancelInstall(String str, int i, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void deferredInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void deferredLanguageInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void deferredLanguageUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void deferredUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void getSessionState(String str, int i, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void getSessionStates(String str, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;

    void startInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException;
}
