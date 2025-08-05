package com.taobao.taobao.scancode.encode.aidlservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes8.dex */
public interface EncodeCallback extends IInterface {
    void onError(EncodeError encodeError) throws RemoteException;

    void onSuccess(BitmapHolder bitmapHolder) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements EncodeCallback {
        private static final String DESCRIPTOR = "com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback";
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        static {
            kge.a(-66581749);
            kge.a(-1330162617);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static EncodeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof EncodeCallback)) {
                return (EncodeCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            BitmapHolder bitmapHolder = null;
            EncodeError encodeError = null;
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    bitmapHolder = BitmapHolder.CREATOR.createFromParcel(parcel);
                }
                onSuccess(bitmapHolder);
                parcel2.writeNoException();
                if (bitmapHolder != null) {
                    parcel2.writeInt(1);
                    bitmapHolder.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    encodeError = EncodeError.CREATOR.createFromParcel(parcel);
                }
                onError(encodeError);
                parcel2.writeNoException();
                if (encodeError != null) {
                    parcel2.writeInt(1);
                    encodeError.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements EncodeCallback {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f21234a;

            static {
                kge.a(1115924341);
                kge.a(-1330162617);
            }

            Proxy(IBinder iBinder) {
                this.f21234a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21234a;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(BitmapHolder bitmapHolder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bitmapHolder != null) {
                        obtain.writeInt(1);
                        bitmapHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f21234a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bitmapHolder.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
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
                    this.f21234a.transact(2, obtain, obtain2, 0);
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
