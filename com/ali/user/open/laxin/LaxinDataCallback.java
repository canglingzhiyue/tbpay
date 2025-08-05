package com.ali.user.open.laxin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public interface LaxinDataCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements LaxinDataCallback {
        static {
            kge.a(-316070387);
            kge.a(992737424);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ali.user.open.laxin.LaxinDataCallback
        public void onData(Map map) throws RemoteException {
        }
    }

    void onData(Map map) throws RemoteException;

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements LaxinDataCallback {
        private static final String DESCRIPTOR = "com.ali.user.open.laxin.LaxinDataCallback";
        static final int TRANSACTION_onData = 1;

        static {
            kge.a(829140066);
            kge.a(992737424);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static LaxinDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof LaxinDataCallback)) {
                return (LaxinDataCallback) queryLocalInterface;
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
            HashMap readHashMap = parcel.readHashMap(getClass().getClassLoader());
            onData(readHashMap);
            parcel2.writeNoException();
            parcel2.writeMap(readHashMap);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements LaxinDataCallback {
            public static LaxinDataCallback sDefaultImpl;
            private IBinder mRemote;

            static {
                kge.a(1730718604);
                kge.a(992737424);
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

            @Override // com.ali.user.open.laxin.LaxinDataCallback
            public void onData(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onData(map);
                    } else {
                        obtain2.readException();
                        obtain2.readHashMap(getClass().getClassLoader());
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(LaxinDataCallback laxinDataCallback) {
            if (Proxy.sDefaultImpl != null || laxinDataCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = laxinDataCallback;
            return true;
        }

        public static LaxinDataCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
