package com.taobao.tao.favorite.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.taobao.tao.favorite.aidl.IFavCallBack;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public interface IFav extends IInterface {
    void doFavManager(Map map, IFavCallBack iFavCallBack) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IFav {
        private static final String DESCRIPTOR = "com.taobao.tao.fav.aidl.IFav";
        static final int TRANSACTION_doFavManager = 1;

        static {
            kge.a(1005306580);
            kge.a(-1479531810);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFav asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFav)) {
                return (IFav) queryLocalInterface;
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
            doFavManager(parcel.readHashMap(getClass().getClassLoader()), IFavCallBack.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IFav {
            private IBinder mRemote;

            static {
                kge.a(-381246338);
                kge.a(-1479531810);
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

            @Override // com.taobao.tao.favorite.aidl.IFav
            public void doFavManager(Map map, IFavCallBack iFavCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    obtain.writeStrongBinder(iFavCallBack != null ? iFavCallBack.asBinder() : null);
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
