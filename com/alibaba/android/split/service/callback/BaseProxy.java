package com.alibaba.android.split.service.callback;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseProxy implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final String f2506a;
    public final IBinder b;

    static {
        kge.a(-493320669);
        kge.a(-1327527845);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseProxy(IBinder iBinder, String str) {
        this.b = iBinder;
        this.f2506a = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.b;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2506a);
        return obtain;
    }

    public void a(int i, Parcel parcel) {
        try {
            this.b.transact(i, parcel, null, 1);
        } catch (RemoteException e) {
            e.printStackTrace();
        } finally {
            parcel.recycle();
        }
    }
}
