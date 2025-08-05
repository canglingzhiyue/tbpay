package com.alibaba.android.split.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class ISplitInstallServiceCallback extends Stub implements SplitInstallResultCallback {
    static {
        kge.a(404031528);
        kge.a(-834719474);
    }

    public ISplitInstallServiceCallback() {
        super("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.alibaba.android.split.core.internal.Stub
    protected final boolean onTransact(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                onStartInstall(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onCompleteInstall(readInt);
                return true;
            case 4:
                onCancelInstall(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 5:
                onGetSession(parcel.readInt(), (Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 6:
                onError((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 7:
                onGetSessionStates(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                onDeferredUninstall((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onDeferredInstall((Bundle) ParcelUtils.toBundle(parcel, Bundle.CREATOR));
                return true;
            case 10:
                ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onGetSplitsForAppUpdate();
                return true;
            case 11:
                ParcelUtils.toBundle(parcel, Bundle.CREATOR);
                onCompleteInstallForAppUpdate();
                return true;
            default:
                return false;
        }
    }
}
