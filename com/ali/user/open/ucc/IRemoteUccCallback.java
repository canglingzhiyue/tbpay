package com.ali.user.open.ucc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public interface IRemoteUccCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements IRemoteUccCallback {
        static {
            kge.a(-408184318);
            kge.a(-739757691);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ali.user.open.ucc.IRemoteUccCallback
        public void onFail(String str, int i, String str2) throws RemoteException {
        }

        @Override // com.ali.user.open.ucc.IRemoteUccCallback
        public void onSuccess(String str, Map map) throws RemoteException {
        }
    }

    void onFail(String str, int i, String str2) throws RemoteException;

    void onSuccess(String str, Map map) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IRemoteUccCallback {
        private static final String DESCRIPTOR = "com.ali.user.open.ucc.IRemoteUccCallback";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        static {
            kge.a(-542784371);
            kge.a(-739757691);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteUccCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRemoteUccCallback)) {
                return (IRemoteUccCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                String readString = parcel.readString();
                HashMap readHashMap = parcel.readHashMap(getClass().getClassLoader());
                onSuccess(readString, readHashMap);
                parcel2.writeNoException();
                parcel2.writeMap(readHashMap);
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                onFail(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements IRemoteUccCallback {
            public static IRemoteUccCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(2048702327);
                kge.a(-739757691);
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

            @Override // com.ali.user.open.ucc.IRemoteUccCallback
            public void onSuccess(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSuccess(str, map);
                    } else {
                        obtain2.readException();
                        obtain2.readHashMap(getClass().getClassLoader());
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ali.user.open.ucc.IRemoteUccCallback
            public void onFail(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onFail(str, i, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemoteUccCallback iRemoteUccCallback) {
            if (Proxy.sDefaultImpl != null || iRemoteUccCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteUccCallback;
            return true;
        }

        public static IRemoteUccCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
