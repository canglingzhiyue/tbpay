package com.taobao.login4android.api.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes7.dex */
public interface ICommonCallback extends IInterface {

    /* loaded from: classes7.dex */
    public static class Default implements ICommonCallback {
        static {
            kge.a(1944379754);
            kge.a(-822910739);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.taobao.login4android.api.aidl.ICommonCallback
        public void onFail(int i, String str) throws RemoteException {
        }

        @Override // com.taobao.login4android.api.aidl.ICommonCallback
        public void onSucess() throws RemoteException {
        }
    }

    void onFail(int i, String str) throws RemoteException;

    void onSucess() throws RemoteException;

    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ICommonCallback {
        private static final String DESCRIPTOR = "com.taobao.login4android.api.aidl.ICommonCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSucess = 1;

        static {
            kge.a(-122161627);
            kge.a(-822910739);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ICommonCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICommonCallback)) {
                return (ICommonCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSucess();
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
                onFail(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes7.dex */
        public static class Proxy implements ICommonCallback {
            public static ICommonCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(2008635151);
                kge.a(-822910739);
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

            @Override // com.taobao.login4android.api.aidl.ICommonCallback
            public void onSucess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSucess();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.login4android.api.aidl.ICommonCallback
            public void onFail(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onFail(i, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(ICommonCallback iCommonCallback) {
            if (Proxy.sDefaultImpl != null || iCommonCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCommonCallback;
            return true;
        }

        public static ICommonCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
