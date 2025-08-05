package com.taobao.tao.favorite.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public interface IFavContentCallBack extends IInterface {
    void onResult(Map map) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IFavContentCallBack {
        private static final String DESCRIPTOR = "com.taobao.tao.fav.aidl.IFavContentCallBack";
        static final int TRANSACTION_onResult = 1;

        static {
            kge.a(-1710149198);
            kge.a(81551680);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFavContentCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFavContentCallBack)) {
                return (IFavContentCallBack) queryLocalInterface;
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
            onResult(parcel.readHashMap(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IFavContentCallBack {
            private IBinder mRemote;

            static {
                kge.a(617149660);
                kge.a(81551680);
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

            @Override // com.taobao.tao.favorite.aidl.IFavContentCallBack
            public void onResult(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
