package com.taobao.login4android.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface ICheckResultCallback extends IInterface {

    /* loaded from: classes7.dex */
    public static class Default implements ICheckResultCallback {
        static {
            kge.a(394891178);
            kge.a(2018135853);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onFail(String str, String str2) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
        public void onSucess(boolean z) throws RemoteException {
        }
    }

    void onFail(String str, String str2) throws RemoteException;

    void onSucess(boolean z) throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ICheckResultCallback {
        private static final String DESCRIPTOR = "com.taobao.login4android.api.aidl.ICheckResultCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSucess = 1;

        static {
            kge.a(1136390117);
            kge.a(2018135853);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICheckResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICheckResultCallback)) {
                return (ICheckResultCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucess(parcel.readInt() != 0);
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
        public static class Proxy implements ICheckResultCallback {
            public static ICheckResultCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(-792002353);
                kge.a(2018135853);
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

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
            public void onSucess(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSucess(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
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

        public static boolean setDefaultImpl(ICheckResultCallback iCheckResultCallback) {
            if (Proxy.sDefaultImpl != null || iCheckResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCheckResultCallback;
            return true;
        }

        public static ICheckResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
