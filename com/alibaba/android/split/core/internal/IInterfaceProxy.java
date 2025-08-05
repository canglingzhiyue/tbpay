package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public class IInterfaceProxy implements IInterface {
    private final IBinder mRemote;
    private final String serviceName;

    static {
        kge.a(907624166);
        kge.a(-1327527845);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IInterfaceProxy(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.serviceName = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel obtainData() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.serviceName);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void transact(int i, Parcel parcel) throws RemoteException {
        try {
            this.mRemote.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
