package com.taobao.tao.favorite.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public interface IFavCallBack extends IInterface {
    void onResult(Map map) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IFavCallBack {
        private static final String DESCRIPTOR = "com.taobao.tao.fav.aidl.IFavCallBack";
        static final int TRANSACTION_onResult = 1;

        static {
            kge.a(-686402705);
            kge.a(2070830435);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFavCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFavCallBack)) {
                return (IFavCallBack) queryLocalInterface;
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
        private static class Proxy implements IFavCallBack {
            private IBinder mRemote;

            static {
                kge.a(-2052385575);
                kge.a(2070830435);
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

            @Override // com.taobao.tao.favorite.aidl.IFavCallBack
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
