package com.alibaba.android.split.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public class Stub extends Binder implements IInterface {
    static {
        kge.a(-329169850);
        kge.a(-1327527845);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean onTransact(int i, Parcel parcel) throws RemoteException {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Stub(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return onTransact(i, parcel);
    }
}
