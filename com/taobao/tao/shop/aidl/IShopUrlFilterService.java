package com.taobao.tao.shop.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import tb.kge;

/* loaded from: classes8.dex */
public interface IShopUrlFilterService extends IInterface {
    void init() throws RemoteException;

    boolean matchUrl(String str) throws RemoteException;

    /* loaded from: classes8.dex */
    public static abstract class Stub extends Binder implements IShopUrlFilterService {
        private static final String DESCRIPTOR = "com.taobao.tao.shop.aidl.IShopUrlFilterService";
        static final int TRANSACTION_init = 2;
        static final int TRANSACTION_matchUrl = 1;

        static {
            kge.a(-557824949);
            kge.a(-1953475833);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShopUrlFilterService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IShopUrlFilterService)) {
                return (IShopUrlFilterService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean matchUrl = matchUrl(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(matchUrl ? 1 : 0);
                return true;
            } else if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel.enforceInterface(DESCRIPTOR);
                init();
                parcel2.writeNoException();
                return true;
            }
        }

        /* loaded from: classes8.dex */
        private static class Proxy implements IShopUrlFilterService {
            private IBinder mRemote;

            static {
                kge.a(-1208225611);
                kge.a(-1953475833);
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

            @Override // com.taobao.tao.shop.aidl.IShopUrlFilterService
            public boolean matchUrl(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.taobao.tao.shop.aidl.IShopUrlFilterService
            public void init() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
