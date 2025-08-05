package com.taobao.android.modular;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes6.dex */
public interface IAidlServiceBridge extends IInterface {
    IBinder bindService(Intent intent) throws RemoteException;

    void unbindService(IBinder iBinder) throws RemoteException;

    /* loaded from: classes6.dex */
    public static abstract class Stub extends Binder implements IAidlServiceBridge {
        private static final String DESCRIPTOR = "com.taobao.android.modular.IAidlServiceBridge";
        static final int TRANSACTION_bindService = 1;
        static final int TRANSACTION_unbindService = 2;

        static {
            kge.a(1519338581);
            kge.a(-1511000899);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAidlServiceBridge asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAidlServiceBridge)) {
                return (IAidlServiceBridge) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                IBinder bindService = bindService(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(bindService);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unbindService(parcel.readStrongBinder());
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* loaded from: classes6.dex */
        private static class Proxy implements IAidlServiceBridge {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f14412a;

            static {
                kge.a(-309771969);
                kge.a(-1511000899);
            }

            Proxy(IBinder iBinder) {
                this.f14412a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14412a;
            }

            @Override // com.taobao.android.modular.IAidlServiceBridge
            public IBinder bindService(Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f14412a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.android.modular.IAidlServiceBridge
            public void unbindService(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.f14412a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
