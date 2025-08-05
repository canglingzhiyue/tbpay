package com.taobao.interact.mediaplayer.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface OnErrorListener extends IInterface {
    boolean onError(String str, int i, int i2) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements OnErrorListener {
        private static final String DESCRIPTOR = "com.taobao.interact.mediaplayer.service.OnErrorListener";
        static final int TRANSACTION_onError = 1;

        static {
            kge.a(933446911);
            kge.a(-1596673581);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static OnErrorListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof OnErrorListener)) {
                return (OnErrorListener) queryLocalInterface;
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
            boolean onError = onError(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(onError ? 1 : 0);
            return true;
        }

        /* loaded from: classes7.dex */
        private static class Proxy implements OnErrorListener {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17598a;

            static {
                kge.a(-863987095);
                kge.a(-1596673581);
            }

            Proxy(IBinder iBinder) {
                this.f17598a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17598a;
            }

            @Override // com.taobao.interact.mediaplayer.service.OnErrorListener
            public boolean onError(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    boolean z = false;
                    this.f17598a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
