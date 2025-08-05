package com.taobao.login4android.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface ITokenCallback extends IInterface {

    /* loaded from: classes7.dex */
    public static class Default implements ITokenCallback {
        static {
            kge.a(1560923294);
            kge.a(-1845444575);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.login4android.api.aidl.ITokenCallback
        public void onFail(String str, String str2) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ITokenCallback
        public void onSucess(String str) throws RemoteException {
        }
    }

    void onFail(String str, String str2) throws RemoteException;

    void onSucess(String str) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ITokenCallback {
        private static final String DESCRIPTOR = "com.taobao.login4android.api.aidl.ITokenCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSucess = 1;

        static {
            kge.a(-1964378255);
            kge.a(-1845444575);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITokenCallback)) {
                return (ITokenCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucess(parcel.readString());
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
                onFail(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public static class Proxy implements ITokenCallback {
            public static ITokenCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(-1224724645);
                kge.a(-1845444575);
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.taobao.login4android.api.aidl.ITokenCallback
            public void onSucess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSucess(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ITokenCallback
            public void onFail(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onFail(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ITokenCallback iTokenCallback) {
            if (Proxy.sDefaultImpl != null || iTokenCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iTokenCallback;
            return true;
        }

        public static ITokenCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
