package com.taobao.interact.mediaplayer.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface OnPreparedListener extends IInterface {
    void onPrepared(String str) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements OnPreparedListener {
        private static final String DESCRIPTOR = "com.taobao.interact.mediaplayer.service.OnPreparedListener";
        static final int TRANSACTION_onPrepared = 1;

        static {
            kge.a(1044796792);
            kge.a(-289048134);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static OnPreparedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof OnPreparedListener)) {
                return (OnPreparedListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            onPrepared(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements OnPreparedListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17599a;

            static {
                kge.a(1902750754);
                kge.a(-289048134);
            }

            Proxy(IBinder iBinder) {
                this.f17599a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17599a;
            }

            @Override // com.taobao.interact.mediaplayer.service.OnPreparedListener
            public void onPrepared(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f17599a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
