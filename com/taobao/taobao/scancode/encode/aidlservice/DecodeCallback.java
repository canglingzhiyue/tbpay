package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes8.dex */
public interface DecodeCallback extends IInterface {
    void onError(EncodeError encodeError) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements DecodeCallback {
        private static final String DESCRIPTOR = "com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        static {
            kge.a(1161606707);
            kge.a(1816023071);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static DecodeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof DecodeCallback)) {
                return (DecodeCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                EncodeError createFromParcel = parcel.readInt() != 0 ? EncodeError.CREATOR.createFromParcel(parcel) : null;
                onError(createFromParcel);
                parcel2.writeNoException();
                if (createFromParcel != null) {
                    parcel2.writeInt(1);
                    createFromParcel.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements DecodeCallback {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f21233a;

            static {
                kge.a(-498772835);
                kge.a(1816023071);
            }

            Proxy(IBinder iBinder) {
                this.f21233a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21233a;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.f21233a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback
            public void onError(EncodeError encodeError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (encodeError != null) {
                        obtain.writeInt(1);
                        encodeError.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21233a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        encodeError.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
