package com.vivo.vms;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes9.dex */
public interface IPCCallback extends IInterface {
    public static final String DESCRIPTOR = "com.vivo.vms.IPCCallback";

    /* loaded from: classes9.dex */
    public static class Default implements IPCCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.vivo.vms.IPCCallback
        public void call(Bundle bundle) throws RemoteException {
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class Stub extends Binder implements IPCCallback {
        static final int TRANSACTION_call = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes9.dex */
        public static class Proxy implements IPCCallback {
            public static IPCCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.vivo.vms.IPCCallback
            public void call(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPCCallback.DESCRIPTOR);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle.readFromParcel(obtain2);
                        }
                    } else {
                        Stub.getDefaultImpl().call(bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPCCallback.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IPCCallback.DESCRIPTOR);
        }

        public static IPCCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPCCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPCCallback)) ? new Proxy(iBinder) : (IPCCallback) queryLocalInterface;
        }

        public static IPCCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPCCallback iPCCallback) {
            if (Proxy.sDefaultImpl == null) {
                if (iPCCallback == null) {
                    return false;
                }
                Proxy.sDefaultImpl = iPCCallback;
                return true;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPCCallback.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(IPCCallback.DESCRIPTOR);
                Bundle bundle = new Bundle();
                call(bundle);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            }
        }
    }

    void call(Bundle bundle) throws RemoteException;
}
